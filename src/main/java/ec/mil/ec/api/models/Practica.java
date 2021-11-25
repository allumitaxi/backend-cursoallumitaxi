package ec.mil.ec.api.models;


public class Practica {
    String valorString;
    public String varificarNumero(int numero){
        if(numero % 3 == 0 && numero % 5 == 0){
            valorString = "FizzBuzz";      
        }else if(numero % 5 == 0){
            valorString = "Buzz";
        }else if (numero % 3 == 0){
            valorString = "Fizz";
        }else{
            valorString = String.valueOf(numero);
        }
        return valorString;
    }
}
