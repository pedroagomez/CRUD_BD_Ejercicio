package com.ejercicioPractico.tp.Service;

import com.ejercicioPractico.tp.DTO.CursoTemaDto;
import com.ejercicioPractico.tp.Model.Curso;

import java.util.List;

public interface ICursoService {

     void createCurso(Curso curso);
     List<Curso>listarCursos();
     Curso obtenerCursoPorId(Long id);
     void eliminarCurso(Long id);
     Curso actualizarCurso(Curso curso);
     CursoTemaDto obtenerTemaCurso(Long id_curso );
     List<Curso>obtenerPalabraEspecifica();
}
