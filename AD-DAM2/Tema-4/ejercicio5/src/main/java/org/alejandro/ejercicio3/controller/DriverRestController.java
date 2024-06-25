package org.alejandro.ejercicio3.controller;

import org.alejandro.ejercicio3.dto.DriverDTO;
import org.alejandro.ejercicio3.dto.DriverDetail;
import org.alejandro.ejercicio3.entity.Driver;
import org.alejandro.ejercicio3.service.Driver.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controlador REST para la entidad Driver
@RestController
@RequestMapping("/api")
public class DriverRestController {

    // Servicio para gestionar los drivers
    private final DriverService driverService;

    // Inyección de dependencias del servicio
    @Autowired
    public DriverRestController(DriverService driverService) {
        this.driverService = driverService;
    }

    // Endpoint para obtener todos los drivers
    @GetMapping("/drivers")
    public ResponseEntity<List<DriverDetail>> getAllDTO(@RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "10") int size,
                                                        @RequestParam(defaultValue = "driverId") String sortBy,
                                                        @RequestParam(defaultValue = "asc") String sortDirect) {

        Page<DriverDetail> driverDTOPage = this.driverService.getAllDriversResponse(page, size, sortBy, sortDirect);
        return new ResponseEntity<>(driverDTOPage.getContent(), HttpStatus.OK);
    }
    // Endpoint para obtener un driver por su código
    @GetMapping("/drivers/{code}")
    public ResponseEntity<Driver> getByCode(@PathVariable String code) {
        return this.driverService.getDriverByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para crear un nuevo driver
    @PostMapping("/drivers")
    public ResponseEntity<Driver> create(@RequestBody Driver driver){
        if (driver.getDriverId() != null) {
            return ResponseEntity.badRequest().build();
        }else {
        this.driverService.saveDriver(driver);
        return ResponseEntity.ok(driver);}
    }

    // Endpoint para actualizar un driver existente
    @PutMapping("/drivers")
    public ResponseEntity<Driver> update(@RequestBody Driver driver){
        this.driverService.saveDriver(driver);
        return ResponseEntity.ok(driver);
    }

    // Endpoint para eliminar un driver por su código
    @DeleteMapping("/drivers/{code}")
    public ResponseEntity<Driver> delete(@PathVariable String code){
        this.driverService.deleteDriver(code);
        return ResponseEntity.ok().build();
    }
}
