package org.bedu.Telsis.Inventario.service;

import org.bedu.Telsis.Inventario.dto.CreateEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.EquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.UpdateEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.UpdateProvedorDTO;
import org.bedu.Telsis.Inventario.exceptiion.EquipamientoNotFoundException;
import org.bedu.Telsis.Inventario.mapper.EquipamientoMapper;
import org.bedu.Telsis.Inventario.model.Equipamiento;
import org.bedu.Telsis.Inventario.model.Provedor;
import org.bedu.Telsis.Inventario.repository.EquipamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipamientoService {
    
    @Autowired
    private EquipamientoRepository repository;

    @Autowired
    private EquipamientoMapper mapper;

    public List<EquipamientoDTO> findAll() {
        return mapper.toDTO(repository.findAll());
    }

    public EquipamientoDTO save(CreateEquipamientoDTO data) {
        Equipamiento entity = repository.save(mapper.toModel(data));
        return mapper.toDTO(entity);
    }
    public void update(long equipamientoId, UpdateEquipamientoDTO data) throws EquipamientoNotFoundException {
        Optional<Equipamiento> result = repository.findById(equipamientoId);

        if(result.isEmpty()){
            throw new EquipamientoNotFoundException(equipamientoId);
        }
        Equipamiento equipamiento = result.get();

        mapper.update(equipamiento, data);
        repository.save(equipamiento);
    }

    public void deleteById(long id) {
        repository.deleteById(id);

    }
}