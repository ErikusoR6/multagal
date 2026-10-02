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
public class PermisoConducir {

    private UUID id;
    private ClasePermiso clase;
    private LocalDate fechaCaducidad;
    private LocalDate fechaRenovacion;
    private EstadoPermiso estado;
    private UUID conductorId;
    private Conductor conductor;
}