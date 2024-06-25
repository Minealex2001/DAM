package org.alejandro.ejercicio3.service.Driver;

import org.alejandro.ejercicio3.model.Driver;

import java.util.List;
import java.util.Optional;

// Método para eliminar un driver por su código
public interface DriverService {
    // Método para obtener todos los drivers
    List<Driver> getAllDrivers();

    // Método para obtener un driver por su código
    Optional<Driver> getDriverByCode(String code);

    // Método para guardar un driver
    void saveDriver(Driver driver);

    // Método para eliminar un driver por su código
    void deleteDriver(String code);
}