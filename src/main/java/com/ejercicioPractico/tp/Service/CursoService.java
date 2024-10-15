package com.ejercicioPractico.tp.Service;

import com.ejercicioPractico.tp.DTO.CursoTemaDto;
import com.ejercicioPractico.tp.Model.Curso;
import com.ejercicioPractico.tp.Repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository cursoRepo;
    @Override
    public void createCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public Curso obtenerCursoPorId(Long id) {
        Curso curso=cursoRepo.findById(id).orElse(null);
        return curso;
    }

    @Override
    public void eliminarCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public Curso actualizarCurso(Curso curso) {
        return cursoRepo.save(curso);
    }

    @Override
    public CursoTemaDto obtenerTemaCurso(Long id_curso) {
        Curso curso=cursoRepo.findById(id_curso).orElse(null);
        CursoTemaDto cursoTemaDto=new CursoTemaDto(curso.getNombre(),curso.getListaDeTemas());

        return cursoTemaDto;
    }

    @Override
    public List<Curso> obtenerPalabraEspecifica() {
        // Implementacion para buscar cursos con palabra "java" en el nombre
            String palabra="java";
            String comparacion = "";
            List<Curso> listaCursos=this.listarCursos();
            List<Curso> cursosJava = new ArrayList<>();
            for(Curso curso: listaCursos)
            {
                //resolvelo
                comparacion = curso.getNombre().toLowerCase();
                if(comparacion.contains(palabra))
                    cursosJava.add(curso);
            }
        return cursosJava;
    }
}
