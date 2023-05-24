package com.usta.equipos.model;

import javax.persistence.*;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "equipos")
public class EquipoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipo")
    private Long id_equipo;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nommbre")
    private String  nommbre;

    @NotNull
    @Column(name = "cant_jugadores")
    private Integer  cant_jugadores;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "descripcion")
    private String  descripcion;

    @JoinColumn(name = "id_pais", referencedColumnName = "id_pais")
    @ManyToOne(fetch = FetchType.EAGER)
    private PaisEntity id_pais;

    @JoinColumn(name = "id_entrenador", referencedColumnName = "id_entrenador")
    @ManyToOne(fetch = FetchType.EAGER)
    private EntrenadorEntity id_entrenador;

    public Long getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Long id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public Integer getCant_jugadores() {
        return cant_jugadores;
    }

    public void setCant_jugadores(Integer cant_jugadores) {
        this.cant_jugadores = cant_jugadores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PaisEntity getId_pais() {
        return id_pais;
    }

    public void setId_pais(PaisEntity id_pais) {
        this.id_pais = id_pais;
    }

    public EntrenadorEntity getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(EntrenadorEntity id_entrenador) {
        this.id_entrenador = id_entrenador;
    }
}
