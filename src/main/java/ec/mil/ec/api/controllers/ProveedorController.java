package ec.mil.ec.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.mil.ec.api.models.Proveedor;
import ec.mil.ec.api.services.ProveedorService;

@RestController
@RequestMapping("/api")
public class ProveedorController {
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/v1/proveedores")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(proveedorService.getAll());
    }

    @PostMapping("/v1/proveedores")
    public ResponseEntity<?> post(@RequestBody Proveedor proeveedor){
        Proveedor proveedorAlmacenado = proveedorService.guardar(proeveedor);
        return ResponseEntity.ok(proveedorAlmacenado);
    }

    @DeleteMapping("/v1/proveedores/{idProveedor}")
    public ResponseEntity<?> delete(@PathVariable long idProveedor){
        Optional<Proveedor> proveedorOptional = proveedorService.getById(idProveedor);
        if(proveedorOptional.isPresent()){
            proveedorService.eliminar(proveedorOptional.get());
            return ResponseEntity.ok("Registro eliminado");
        }else{
            return ResponseEntity.badRequest().body("No existe proveedor");
        }
    }
}
