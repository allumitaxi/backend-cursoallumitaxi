package ec.mil.ec.api.controllers;
/*import java.util.ArrayList;
import java.util.Date;
import java.util.List;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.mil.ec.api.dtos.PedidoDtos;
import ec.mil.ec.api.models.Pedido;
import ec.mil.ec.api.services.PedidoService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/v1/pedidos")
    public ResponseEntity<?> post(@RequestBody PedidoDtos pedidoDtos){
        log.info("Almacenado pedido "+pedidoDtos);
        
        /*Pedido pedido = new Pedido();
        pedido.setFecha(new Date());
        pedido.setSubtotal(pedidoDtos.getSubtotal());
        Cliente cliente = new Cliente();
        cliente.setId(pedidoDtos.getCliente());
        pedido.setCliente(cliente);

        List<DetallePedido> detalleEntidades = new ArrayList<>();
        for(DetallePedidoDto tmp : pedidoDtos.getDetalles()){
            DetallePedido detallePedido = new DetallePedido();
            detallePedido.setPrecio(tmp.getPrecio());
            detallePedido.setCantidad(tmp.getCantidad());
            Producto producto = new Producto();
            producto.setId((tmp.getProducto()));
            detallePedido.setProducto(producto);;
            detalleEntidades.add(detallePedido);
        }
        Pedido pedidoAlmacenado = pedidoService.guardar(pedido, detalleEntidades);*/
        Pedido pedidoAlmacenado = pedidoService.guardarDto(pedidoDtos);
        return ResponseEntity.ok(pedidoAlmacenado);
    }
}
