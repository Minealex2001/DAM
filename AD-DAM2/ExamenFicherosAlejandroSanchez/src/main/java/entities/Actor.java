package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

    @JsonProperty("name")
    private String nombre;
    @JsonProperty("sex")
    private String sexo;
    @JsonProperty("yearOfBirth")
    private int anyoNacimiento;
    @JsonProperty("movies")
    private List<Pelicula> peliculas;

}
