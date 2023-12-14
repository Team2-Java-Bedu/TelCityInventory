package org.bedu.Telsis.Inventario.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.bedu.Telsis.Inventario.dto.CreateEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.EquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.UpdateEquipamientoDTO;
import org.bedu.Telsis.Inventario.exceptiion.EquipamientoNotFoundException;
import org.bedu.Telsis.Inventario.service.EquipamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@Tag(name =  "Endpoint de equipamientos", description = "CRUD de de equipamiento")
@RestController
@RequestMapping("equipamiento")
public class EquipamientoController {
    
    @Autowired
    private EquipamientoService service;

    @Operation(summary = "Obtiene la lista de todos los equiposs en la BD")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EquipamientoDTO> findAll() {

        return service.findAll();
    }

    @Operation(summary = "Crea nuevos equipos en la BD")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EquipamientoDTO save(@Valid @RequestBody CreateEquipamientoDTO data) {

        return service.save(data);
    }
    @Operation(summary = "Actualiza la información de un equipo")
    @PutMapping("{equipamientoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable long equipamientoId, @Valid @RequestBody UpdateEquipamientoDTO data)throws EquipamientoNotFoundException {
        service.update(equipamientoId, data);
    }
    @Operation(summary = "Elimina la información de un equipo")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        service.deleteById(id);
}
}
