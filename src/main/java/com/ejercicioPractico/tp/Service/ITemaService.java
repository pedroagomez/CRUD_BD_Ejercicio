package com.ejercicioPractico.tp.Service;

import com.ejercicioPractico.tp.Model.Curso;
import com.ejercicioPractico.tp.Model.Tema;

import java.util.List;

public interface ITemaService {
    void createTema(Tema tema);
    List<Tema> listarTemas();
    Tema obtenerTemaPorID(Long id);
    void eliminarTema(Long id);
    Tema actualizarTema(Tema tema);

}
