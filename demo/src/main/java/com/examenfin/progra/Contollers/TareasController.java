package com.examenfin.progra.Contollers;

import com.examenfin.progra.Entities.Tareas;
import com.examenfin.progra.services.TareasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Lesther Imanol Zacarìas Lòpez
@RestController
@RequestMapping("/tareas")
public class TareasController {

    private TareasService tareasService;

    public TareasController(TareasService tareasService){
        this.tareasService = tareasService;
    }

    @GetMapping
    public List<Tareas> GetAll(){
        return tareasService.findAll();
    }

    @GetMapping(value="/{id}")
    public Tareas GetById(@PathVariable Long id){
        return tareasService.findById(id);
    }


    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Tareas tareas  ){
        tareasService.update(id, tareas);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        tareasService.delete(id);
    }



}
