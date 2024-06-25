package org.alejandro.ejercicio3.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "raceid")
    private Long id;

    private int year;
    private int round;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "circuitid")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private Circuit circuit;

    private String name;
    private LocalDate date;
    private LocalTime time;
    private String url;
}
