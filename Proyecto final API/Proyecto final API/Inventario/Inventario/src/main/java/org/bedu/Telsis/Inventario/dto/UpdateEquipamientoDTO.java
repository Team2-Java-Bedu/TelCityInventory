package org.bedu.Telsis.Inventario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateEquipamientoDTO {
    @Schema(description = "Tipo de Equipo", example = "Switch")
    @NotBlank
    private String tipo;

    @Schema(description = "Modelo del equipo", example = "Air000007")
    @NotBlank
    private String modelo;
}
