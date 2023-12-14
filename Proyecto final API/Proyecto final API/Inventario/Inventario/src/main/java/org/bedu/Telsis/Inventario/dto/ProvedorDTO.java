package org.bedu.Telsis.Inventario.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProvedorDTO {
    
    @Schema(description = "Identificador de provedor", example = "2")
    private long id;
    @Schema(description = "Nombre del provedor", example = "Provedor2")
    private String name;
}