package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pelicula {
    @JsonProperty("title")
    private String titulo;
    @JsonProperty("year")
    private int anyo;
}
