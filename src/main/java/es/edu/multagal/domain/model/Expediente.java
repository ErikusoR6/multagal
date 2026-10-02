package es.edu.multagal.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Expediente {

    private UUID id;
    private String numeroExpediente;

    private UUID denunciaId;
    private Denuncia denuncia;

    private String instructor;
    private EstadoExpediente estado;
    private BigDecimal importe;
    private LocalDate fechaApertura;
    private LocalDate fechaResolucion;
}