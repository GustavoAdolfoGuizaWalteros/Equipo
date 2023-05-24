package com.usta.equipos.model;

import javax.persistence.*;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "entrenadores")
public class EntrenadorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrenador")
    private Long id_entrenador;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nommbres")
    private String  nommbres;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apeliidos")
    private String  apellidos;

    @NotNull
    @Column(name = "estado")
    private Boolean  estado;

    public Long getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(Long id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public String getNommbres() {
        return nommbres;
    }

    public void setNommbres(String nommbres) {
        this.nommbres = nommbres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
