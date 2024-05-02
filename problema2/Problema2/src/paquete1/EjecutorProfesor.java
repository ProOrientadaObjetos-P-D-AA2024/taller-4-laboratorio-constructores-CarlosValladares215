/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Profesor;

public class EjecutorProfesor {

    public static void main(String[] args) {
        Profesor uno = new Profesor("Juan", "Gomez", "055549223", 1000);
        uno.setSueldototal();
        
        Profesor dos = new Profesor ("Maria","Parra","056066224",1350);
        dos.setSueldototal();

        System.out.println("-----------------------------");
        System.out.println(uno.toString());
        System.out.println("-----------------------------");
        System.out.println(dos.toString());
    }
}
