package com.ejercicioPractico.tp.Service;

import com.ejercicioPractico.tp.Model.Curso;
import com.ejercicioPractico.tp.Model.Tema;
import com.ejercicioPractico.tp.Repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {
    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public void createTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public List<Tema> listarTemas() {
        return temaRepo.findAll();
    }

    @Override
    public Tema obtenerTemaPorID(Long id) {
        Tema tema = temaRepo.findById(id).orElse(null);
        return tema;
    }

    @Override
    public void eliminarTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public Tema actualizarTema(Tema tema) {
           return  temaRepo.save(tema);
    }
}
