package org.bedu.Telsis.Inventario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateEquipamientoDTO {
    
    @Schema(description = "Tipo de equipamiento", example = "Sw, Ap, PoE")
    @NotBlank(message = "El tipo del equipo es obligatorio")
    private String tipo;

    @Schema(description = "Modelo de equipamiento", example = "Air0000001")
    @NotBlank(message = "El modelo del equipo es obligatorio")
    private String modelo;

}