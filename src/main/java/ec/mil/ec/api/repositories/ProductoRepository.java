package ec.mil.ec.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.mil.ec.api.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    List<Producto> findByDescripcionContains(String descripcion);
}
