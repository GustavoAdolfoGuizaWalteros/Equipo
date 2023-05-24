package com.usta.equipos.model;

import javax.persistence.*;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "paises")
public class PaisEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Long id_pais;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nommbre_pais")
    private String  nombre_pais;

    public Long getId_pais() {
        return id_pais;
    }

    public void setId_pais(Long id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
}
