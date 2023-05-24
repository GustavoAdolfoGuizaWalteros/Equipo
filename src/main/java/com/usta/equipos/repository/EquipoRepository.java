package com.usta.equipos.repository;

import com.usta.equipos.model.EquipoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<EquipoEntity, Long> {
}
