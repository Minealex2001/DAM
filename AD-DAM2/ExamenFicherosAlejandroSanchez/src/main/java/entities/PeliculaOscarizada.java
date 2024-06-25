package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeliculaOscarizada {
    private int anyo;
    private int edad;
    private String actor;
    private String sexo;
    private String pelicula;
}
