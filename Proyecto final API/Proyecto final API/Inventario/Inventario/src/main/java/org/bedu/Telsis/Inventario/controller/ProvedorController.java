package org.bedu.Telsis.Inventario.controller;

import java.util.List;

//import main.java.org.bedu.Telsis.Inventario.dto.AddEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.ProvedorDTO;
import org.bedu.Telsis.Inventario.dto.UpdateProvedorDTO;
import org.bedu.Telsis.Inventario.exceptiion.ProvedorNotFoundException;
import org.bedu.Telsis.Inventario.model.Provedor;
import org.bedu.Telsis.Inventario.dto.CreateProvedorDTO;
import org.bedu.Telsis.Inventario.service.ProvedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name =  "Endpoint de provedores", description = "CRUD de provedores")
@RestController
@RequestMapping("provedor")
public class ProvedorController {
    
    @Autowired
    private ProvedorService service;
    
    @Operation(summary = "Obtiene la lista de todos los provedores en la BD")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProvedorDTO> findAll() {

        return service.findAll();
    }

    @Operation(summary = "Crea nuevos provedores  en la BD")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProvedorDTO save(@Valid @RequestBody CreateProvedorDTO data) {
        return service.save(data);
    }


    @Operation(summary = "Actualiza la información de un provedor")
    @PutMapping("{provedorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable long provedorId, @Valid @RequestBody UpdateProvedorDTO data)throws ProvedorNotFoundException {
        service.update(provedorId, data);
    }
    @Operation(summary = "Elimina la información de un provedor")
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
