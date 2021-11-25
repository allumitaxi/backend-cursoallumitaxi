package ec.mil.ec.api.dtos;

import lombok.Data;

@Data
public class DetallePedidoDto {

    private long producto;
    private int cantidad;
    private double precio;
}
