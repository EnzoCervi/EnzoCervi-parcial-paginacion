package com.utn.utnApiRest.entities;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Persona extends Base  {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;



    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false,  fetch = FetchType.EAGER)
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    @Builder.Default
    private List<Libro> libros = new ArrayList<>();

    public void AddLibros (Libro l1){
        libros.add(l1);
    }

}
