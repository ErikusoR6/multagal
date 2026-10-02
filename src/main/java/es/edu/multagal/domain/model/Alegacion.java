package es.edu.multagal.domain.model;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Alegacion {

    private UUID id;
    private String escritoPresentado;
    private List<String> documentosAdjuntos;

    private UUID expedienteId;
    private Expediente expediente;
}