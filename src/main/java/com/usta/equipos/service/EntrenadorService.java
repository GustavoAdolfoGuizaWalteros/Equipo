package com.usta.equipos.service;

import com.usta.equipos.model.EntrenadorEntity;
import com.usta.equipos.repository.EntrenadorRepository;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {
    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<EntrenadorEntity>  findAll(){
        return entrenadorRepository.findAll();
    }

    public EntrenadorEntity create(EntrenadorEntity entrenadorEntity){
        return entrenadorRepository.save(entrenadorEntity);
    }

    public void delete(Long id){
        entrenadorRepository.deleteById(id);
    }


}
