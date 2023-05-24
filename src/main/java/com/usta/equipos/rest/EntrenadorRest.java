package com.usta.equipos.rest;

import com.usta.equipos.model.EntrenadorEntity;
import com.usta.equipos.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entrenador")
public class EntrenadorRest {
    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping("/listar")
    private ResponseEntity<List<EntrenadorEntity>> findAll(){
        return ResponseEntity.ok(entrenadorService.findAll());
    }

    @PostMapping("/crear")
    private ResponseEntity<EntrenadorEntity> save(@RequestBody EntrenadorEntity entrenadorEntity){
        return ResponseEntity.ok(entrenadorService.create(entrenadorEntity));
    }

    @PutMapping("/editar")
    private ResponseEntity<EntrenadorEntity> update (@RequestBody EntrenadorEntity entrenadorEntity){
        try {
            return ResponseEntity.ok(entrenadorService.create(entrenadorEntity));
        }catch (Exception e){
            System.out.println("el Error es: "+ e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Long id){
        entrenadorService.delete(id);
        return ResponseEntity.ok("Registro eliminado exitosamente");
    }
}
