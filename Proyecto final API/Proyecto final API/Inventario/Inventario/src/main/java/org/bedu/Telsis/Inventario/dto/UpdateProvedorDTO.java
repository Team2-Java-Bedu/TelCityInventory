package org.bedu.Telsis.Inventario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateProvedorDTO {
    @Schema(description = "Nombre del provedor", example = "CDS")
    @NotBlank
    private String name;
}
