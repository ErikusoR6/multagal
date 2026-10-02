package es.edu.multagal.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Notificacion {

    private UUID id;
    private int intentoDeNotificacion;
    private LocalDateTime fecha;
    private String acuse;
    private ResultadoNotificacion resultado;

    private UUID expedienteId;
    private Expediente expediente;
}