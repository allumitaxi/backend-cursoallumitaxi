package ec.mil.ec.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.mil.ec.api.models.Producto;
import ec.mil.ec.api.repositories.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
    
    public List<Producto> getAll(){
        return productoRepository.findAll();
    }

    public Optional<Producto> getById(long idProveedor){
        return productoRepository.findById(idProveedor);
    }

    public Producto guardar(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto actualizar(Producto producto, Producto productoActualizado){
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setPrecio(productoActualizado.getPrecio());
        producto.setProveedor(productoActualizado.getProveedor());
        return productoRepository.save(producto);
    }

    public void eliminar(Producto producto){
        productoRepository.delete(producto);
    }

}
