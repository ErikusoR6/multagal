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
public class Pago {

    private UUID id;
    private BigDecimal abonoTotalOParcial;
    private BigDecimal bonificacionProntoPago;
    private LocalDate fechaPago;

    private UUID expedienteId;
    private Expediente expediente;
}