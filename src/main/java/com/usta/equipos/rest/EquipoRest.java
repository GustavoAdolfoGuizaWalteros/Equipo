package com.usta.equipos.rest;

import com.usta.equipos.model.EquipoEntity;
import com.usta.equipos.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipo")
public class EquipoRest {
    @Autowired
    private EquipoService equipoService;

    @GetMapping("/listar")
    private ResponseEntity<List<EquipoEntity>> findAll(){
        return ResponseEntity.ok(equipoService.findAll());
    }

    @PostMapping("/crear")
    private ResponseEntity<EquipoEntity> save(@RequestBody EquipoEntity equipoEntity){
        return ResponseEntity.ok(equipoService.create(equipoEntity));
    }

    @PutMapping("/editar")
    private ResponseEntity<EquipoEntity> update (@RequestBody EquipoEntity equipoEntity){
        try {
            return ResponseEntity.ok(equipoService.create(equipoEntity));
        }catch (Exception e){
            System.out.println("el Error es: "+ e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Long id){
        equipoService.delete(id);
        return ResponseEntity.ok("Registro eliminado exitosamente");
    }
}
