package paquete1;

import paquete2.Cheque;

public class Ejecutor {

    public static void main(String[] args) {
        
        String nombre = "Juan Perez";
        String banco = "Banco de Loja";
        
        // objeto 1
        Cheque cheque01 = new Cheque();
        
        cheque01.setNombreCliente(nombre);
        cheque01.setNombreBanco(banco);
        cheque01.CalcularComision();
        
        System.out.println("------------------Cheque #01-------------------- ");
        System.out.println(cheque01.toString());
        
        // objeto 2
        Cheque cheque02 = new Cheque(4300);
        
        nombre = "Pedro Sanchez";
        banco = "Banco del Pichincha";
        
        cheque02.setNombreCliente(nombre);
        cheque02.setNombreBanco(banco);
        cheque02.CalcularComision();
        
        System.out.println("------------------Cheque #02-------------------- ");
        System.out.println(cheque02.toString());
    }
    
}
