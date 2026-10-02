package es.edu.multagal.domain.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Radar {

    private UUID id;
    private String identificador;
    private Coordenadas ubicacion;
    private String tipo;
    private int limiteVelocidad;
}