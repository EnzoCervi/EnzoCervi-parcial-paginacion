package com.utn.utnApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor extends Base {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia" , length = 1500)
    private String biografia;
}
