package org.bedu.Telsis.Inventario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class EquipamientoDTO {
    
    @Schema(description = "Identificador del equipamiento", example = "7")
    private long id;
    @Schema(description = "Tipo de equipamiento", example = "SW")
    private String tipo;
    @Schema(description = "Modelo de equipamiento", example = "Air000002")
    private String modelo;
}