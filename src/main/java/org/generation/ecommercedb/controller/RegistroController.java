package org.generation.ecommercedb.controller;

import org.generation.ecommercedb.model.Registro;
import org.generation.ecommercedb.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/registro/")
//@CrossOrigin(origins="*")
public class RegistroController {

    RegistroService alumnoService;

    public RegistroController(@Autowired RegistroService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/{id}")
    public Registro getRegistro(@PathVariable Integer id) {
        return alumnoService.getRegistro(id);
    }

    @GetMapping("/all")
    public List<Registro> getRegistros(){
        return alumnoService.getRegistros();
    }


    // Escribir
    @PostMapping
    public Registro saveRegistro(@RequestBody Registro registro) {
        return alumnoService.saveRegistro(registro);
    }

    // Borrar
    @DeleteMapping("delete/{id}")
    public void deleteRegistro(@PathVariable Integer id) {
        alumnoService.deleteRegistro(id);
    }

    // Actualizar
    @PutMapping
    public Registro updateAlumno(@RequestBody Registro registro) {
        return alumnoService.updateRegistro(registro);
    }






}
