package com.ejercicioPractico.tp.Controller;

import com.ejercicioPractico.tp.DTO.CursoTemaDto;
import com.ejercicioPractico.tp.Model.Curso;
import com.ejercicioPractico.tp.Service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoService;


    //Obtener todos los cursos

    @GetMapping("/curso/traer")
    public List<Curso> traerCurso() {
        return cursoService.listarCursos();
    }

    @GetMapping("/curso/traer/{id}")
    @ResponseBody
    public Curso traerCursoPorId(@PathVariable("id") Long id) {
        return cursoService.obtenerCursoPorId(id);
    }


    // Crear un nuevo curso
    @PostMapping("curso/create")
    public void createCurso(@RequestBody Curso curso)
    {
        cursoService.createCurso(curso);
    }

    @PutMapping("curso/editar")
    public Curso editarCurso(@RequestBody Curso curso)
    {
        cursoService.actualizarCurso(curso);
        return cursoService.obtenerCursoPorId(curso.getId_curso());
    }

    @DeleteMapping("/curso/eliminar/{id}")
    public void eliminarCurso(@PathVariable("id") Long id)
    {
        cursoService.eliminarCurso(id);
    }

    // Obtener temas de un determinado curso

    @GetMapping("/curso/temas/{id}")
    public CursoTemaDto obtenerTemasPorCurso(@PathVariable("id") Long id) {
        return cursoService.obtenerTemaCurso(id);
    }


    // Obtener cursos que contienen la palabra 'Java'

    @GetMapping("/curso/java")
    public List<Curso> obtenerPalabraEspecifica() {
        return cursoService.obtenerPalabraEspecifica();
    }
}
