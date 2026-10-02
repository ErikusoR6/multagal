package es.edu.multagal.domain.model;

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
public class Resolucion {

    private UUID id;
    private String actoQuePoneFin;
    private boolean firme;
    private LocalDate fechaResolucion;

    private UUID expedienteId;
    private Expediente expediente;
}