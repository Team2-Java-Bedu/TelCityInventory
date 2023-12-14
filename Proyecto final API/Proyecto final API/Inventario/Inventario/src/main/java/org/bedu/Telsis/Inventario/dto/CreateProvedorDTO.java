package org.bedu.Telsis.Inventario.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateProvedorDTO {
    
    @Schema(description = "Nombre del provedor", example = "Provedor1")
    @NotBlank(message = "El nombre del provedor es obligatorio")
    private String name;
}
