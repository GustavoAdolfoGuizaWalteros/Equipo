package com.usta.equipos.service;

import com.usta.equipos.model.EquipoEntity;
import com.usta.equipos.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;

    public List<EquipoEntity> findAll(){
        return equipoRepository.findAll();
    }

    public EquipoEntity create(EquipoEntity equipoEntity){
        return equipoRepository.save(equipoEntity);
    }

    public void delete(Long id){
        equipoRepository.deleteById(id);
    }

}
