package com.ejercicioPractico.tp.Repository;

import com.ejercicioPractico.tp.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
}
