package com.usta.equipos.repository;

import com.usta.equipos.model.EntrenadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrenadorRepository extends JpaRepository<EntrenadorEntity, Long> {
}
