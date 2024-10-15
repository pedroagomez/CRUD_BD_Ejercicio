package com.ejercicioPractico.tp.Repository;

import com.ejercicioPractico.tp.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long> {
}
