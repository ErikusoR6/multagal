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
public class Vehiculo {

    private UUID id;
    private Matricula matricula;
    private String marca;
    private String modelo;
    private String tipo;
    private LocalDate fechaMatriculacion;
    private EstadoItv estadoITV;
}