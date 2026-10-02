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
public class Titularidad {

    private UUID id;

    private UUID conductorId;
    private Conductor conductor;

    private UUID vehiculoId;
    private Vehiculo vehiculo;

    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
}