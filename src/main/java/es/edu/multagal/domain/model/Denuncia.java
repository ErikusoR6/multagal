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
public class Denuncia {

    private UUID id;
    private String hechoDenunciado;
    private LocalDateTime fecha;
    private Coordenadas lugar;
    private String denunciante;

    private UUID infraccionImputadaId;
    private Infraccion infraccionImputada;

    private UUID vehiculoId;
    private Vehiculo vehiculo;

    private UUID conductorId;
    private Conductor conductor;
}