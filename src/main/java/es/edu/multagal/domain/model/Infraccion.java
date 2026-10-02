package es.edu.multagal.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Infraccion {

    private UUID id;
    private String codigo;
    private String articuloReglamento;
    private String descripcion;
    private BigDecimal importeBase;
    private int puntoDetraer;
    private GravedadInfraccion gravedad;
}