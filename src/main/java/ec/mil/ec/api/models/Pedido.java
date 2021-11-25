package ec.mil.ec.api.models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;     
    @ManyToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;
    private Date fecha;
    private Double subtotal;    
}
