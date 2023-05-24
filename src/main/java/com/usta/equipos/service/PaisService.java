package com.usta.equipos.service;

import com.usta.equipos.model.EquipoEntity;
import com.usta.equipos.model.PaisEntity;
import com.usta.equipos.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public List<PaisEntity> findAll(){
        return paisRepository.findAll();
    }

    public PaisEntity create(PaisEntity paisEntity){
        return paisRepository.save(paisEntity);
    }

    public void delete(Long id){
        paisRepository.deleteById(id);
    }
}
