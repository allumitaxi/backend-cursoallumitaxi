package ec.mil.ec.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.ec.api.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
