package ec.mil.ec.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.ec.api.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    Cliente findByCedula(String cedula);

    List<Cliente> findByNombre(String nombre);
   
}
