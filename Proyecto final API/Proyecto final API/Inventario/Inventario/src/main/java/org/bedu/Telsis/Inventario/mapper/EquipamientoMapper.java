package org.bedu.Telsis.Inventario.mapper;

import org.bedu.Telsis.Inventario.dto.CreateEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.EquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.UpdateEquipamientoDTO;
import org.bedu.Telsis.Inventario.dto.UpdateProvedorDTO;
import org.bedu.Telsis.Inventario.model.Equipamiento;
import org.bedu.Telsis.Inventario.model.Provedor;
import org.mapstruct.*;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(componentModel = "spring", injectionStrategy = CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EquipamientoMapper {
    
    EquipamientoDTO toDTO(Equipamiento model);

    List<EquipamientoDTO> toDTO(List<Equipamiento> model);

    @Mapping(target = "id", ignore = true)
    Equipamiento toModel(CreateEquipamientoDTO dto);

    @Mapping(target ="id", ignore = true)
    void update(@MappingTarget Equipamiento equipamiento, UpdateEquipamientoDTO data);
}