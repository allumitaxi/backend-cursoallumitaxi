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

import ec.mil.ec.api.models.Cliente;
import ec.mil.ec.api.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
    
    /*@GetMapping("/api/{nombre}")
    public String prueba(@PathVariable String nombre){
        return "Hola"+nombre;
    }
    
    @GetMapping("/v2/demo/{nombre}/{apellido}")
    public String pruebaActualizado(@PathVariable String nombre, @PathVariable String apellido){
        return "Hola "+nombre+" "+apellido;
    }*/

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/v1/clientes")
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(clienteService.getAll());
    }

    @PostMapping("/v1/clientes")
    public ResponseEntity<?> post(@RequestBody Cliente cliente){
        Cliente clienteAlmacenado = clienteService.guardar(cliente);
        return ResponseEntity.ok(clienteAlmacenado);
    }

    @DeleteMapping("/v1/clientes/{idCliente}")
    public ResponseEntity<?> delete(@PathVariable long idCliente){
        Optional<Cliente> clienteOptional = clienteService.getById(idCliente);
        if(clienteOptional.isPresent()){
            clienteService.eliminar(clienteOptional.get());
            return ResponseEntity.ok("Registro eliminado");
        }else{
            return ResponseEntity.badRequest().body("No existe cliente");
        }
    }
}
