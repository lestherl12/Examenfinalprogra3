package com.examenfin.progra.repositories;

import com.examenfin.progra.Entities.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tareas, Long> {
}
