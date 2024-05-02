/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package paquete1;
import paquete2.Estudiante;

public class EjecutorEstudiante {
    public static void main(String[] args) {
        Estudiante uno =new Estudiante("Juan",7,8,3);
        uno.calcularPromedio();
        
        Estudiante dos =new Estudiante("Maria",7,8,7.5);
        dos.calcularPromedio();
        
        
        System.out.println(uno.toString());
        
        System.out.println(dos.toString());
    }
    
}
