package org.bedu.Telsis.Inventario.mapper;

import java.util.List;

import org.bedu.Telsis.Inventario.dto.CreateProvedorDTO;

import org.bedu.Telsis.Inventario.dto.UpdateProvedorDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import org.bedu.Telsis.Inventario.dto.ProvedorDTO;
import org.bedu.Telsis.Inventario.model.Provedor;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProvedorMapper {
    
    ProvedorDTO toDTO(Provedor model);
    
    List<ProvedorDTO> toDTO(List<Provedor> model);

    @Mapping(target = "id", ignore = true)
    Provedor toModel(CreateProvedorDTO dto);
    //Actualiza la referencia de Provedor conlo que haya en UpdateProvedorDTO
    @Mapping(target ="id", ignore = true)
    void update(@MappingTarget Provedor provedor, UpdateProvedorDTO data);
}