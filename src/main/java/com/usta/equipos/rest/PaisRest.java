package com.usta.equipos.rest;

import com.usta.equipos.model.PaisEntity;
import com.usta.equipos.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pais")
public class PaisRest {
    @Autowired
    private PaisService paisService;

    @GetMapping("/listar")
    private ResponseEntity<List<PaisEntity>> findAll(){
        return ResponseEntity.ok(paisService.findAll());
    }

    @PostMapping("/crear")
    private ResponseEntity<PaisEntity> save(@RequestBody PaisEntity paisEntity){
        return ResponseEntity.ok(paisService.create(paisEntity));
    }

    @PutMapping("/editar")
    private ResponseEntity<PaisEntity> update (@RequestBody PaisEntity paisEntity){
        try {
            return ResponseEntity.ok(paisService.create(paisEntity));
        }catch (Exception e){
            System.out.println("el Error es: "+ e);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/eliminar/{}")
    private ResponseEntity<String> delete(@PathVariable("id") Long id){
        paisService.delete(id);
        return ResponseEntity.ok("Registro eliminado exitosamente");
    }
}
