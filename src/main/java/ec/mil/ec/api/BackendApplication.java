package ec.mil.ec.api;

//import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import ec.mil.ec.api.models.Factura;
//import ec.mil.ec.api.models.Practica;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		/*System.out.println("Ejecutando...");

		Factura facturaVentas = new Factura();
		Practica devuelveKata = new Practica();
		facturaVentas.setTotal(20);
		facturaVentas.setFecha(new Date());
		System.out.println(facturaVentas);
		System.out.println(facturaVentas.calcularImpuesto());

		String condicion;
		if(facturaVentas.calcularImpuesto() > 20){
			condicion = "Calculado Impuesto";
		}else{
			condicion = "No calculado";
		}
		System.out.println(condicion);

		for(int i = 1;i<=100;i++){
			//System.out.println("Paso: "+ i);
			System.out.println(i+" = "+devuelveKata.varificarNumero(i));
		}*/

	}

}
