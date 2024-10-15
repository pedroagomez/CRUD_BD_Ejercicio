package com.ejercicioPractico.tp.DTO;

import com.ejercicioPractico.tp.Model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CursoTemaDto {
    private String nombreCurso;
    private List<Tema> listaTemas;

    public CursoTemaDto(String nombreCurso, List<Tema> listaTemas) {
        this.nombreCurso = nombreCurso;
        this.listaTemas = listaTemas;
    }

}
