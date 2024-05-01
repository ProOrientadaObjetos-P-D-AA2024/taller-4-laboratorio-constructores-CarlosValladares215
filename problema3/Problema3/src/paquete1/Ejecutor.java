/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Automotor;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cedulaD = "135768523";
        String marcaV = "Toyota"; 
        
        // objeto 1
        Automotor automotor1 = new Automotor();
        
        automotor1.setCedulaPropietario(cedulaD);
        automotor1.setMarcaVehiculo(marcaV);
        automotor1.calcularAntiguedadVehiculo();
        automotor1.calcularValorMatricula();
        
        System.out.println("---------------Vehículo 1------------------------");
        System.out.println(automotor1.toString());
        
        // objeto 2
        Automotor automotor2 = new Automotor(2017, 30000);
        
        cedulaD = "17541516";
        marcaV = "Chevrolet";
        
        automotor2.setCedulaPropietario(cedulaD);
        automotor2.setMarcaVehiculo(marcaV);
        automotor2.calcularAntiguedadVehiculo();
        automotor2.calcularValorMatricula();
        
        System.out.println("---------------Vehículo 2------------------------");
        System.out.println(automotor2.toString());
        
    }
    
}
