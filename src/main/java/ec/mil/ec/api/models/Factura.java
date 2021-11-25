package ec.mil.ec.api.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Factura {
    private Date fecha;
    private double total;
    final String valorConstante = "VALOR_CONSTANTE";

    public double calcularImpuesto(){
        return this.total+1.15;
    }
}
