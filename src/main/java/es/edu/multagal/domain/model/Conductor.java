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
public class Conductor {

    private UUID id;
    private String NIF;
    private String nombre;
    private DireccionPostal domicilio;
    private LocalDate fechaExpedicion;
    private int puntos;
}