package com.ejercicioPractico.tp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String modaldiad;
    private String fechaFinalizacion;
    @OneToMany(mappedBy = "curso")
    private List<Tema>listaDeTemas;


    public Curso(Long id_curso, String nombre, String modaldiad, String fechaFinalizacion) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modaldiad = modaldiad;
        this.fechaFinalizacion = fechaFinalizacion;
        this.listaDeTemas = new ArrayList<>();
    }

    public Curso() {
    }
}
