package com.ejercicioPractico.tp.Controller;

import com.ejercicioPractico.tp.Model.Curso;
import com.ejercicioPractico.tp.Model.Tema;
import com.ejercicioPractico.tp.Service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private ITemaService temaService;


    @GetMapping("/tema/traer")
    @ResponseBody
    public List<Tema> traerTema() {
        return temaService.listarTemas();
    }

    @GetMapping("/tema/traer/{id}")
    @ResponseBody
    public Tema traerTemaPorId(@PathVariable("id") Long id) {

        return temaService.obtenerTemaPorID(id);
    }


    // Crear tema 
    @PostMapping("tema/create")
    public void createTema(@RequestBody Tema tema)
    {
        temaService.createTema(tema);
    }

    @PutMapping("tema/editar")
    public Tema editarTema(@RequestBody Tema tema)
    {
        temaService.actualizarTema(tema);
        return temaService.obtenerTemaPorID(tema.getId_tema());
    }

    @DeleteMapping("/tema/eliminar/{id}")
    public void eliminarTema(@PathVariable("id") Long id)
    {
        temaService.eliminarTema(id);
    }

}
