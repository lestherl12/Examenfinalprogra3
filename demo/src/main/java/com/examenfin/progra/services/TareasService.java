package com.examenfin.progra.services;

import com.examenfin.progra.Entities.Tareas;

import java.util.List;

public interface TareasService {
    public List<Tareas> findAll();
    public Tareas findById(Long id);
    public void create(Tareas tareas);
    public void update(Long id, Tareas tareas);
    public void delete(Long id);
}
