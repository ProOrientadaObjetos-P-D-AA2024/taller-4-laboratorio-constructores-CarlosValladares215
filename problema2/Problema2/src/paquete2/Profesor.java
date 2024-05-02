/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private double sueldototal;

    public Profesor(String nombre, String apellido, String cedula, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldototal() {
        return sueldototal;
    }

    public void setSueldototal() {
        this.sueldototal = (sueldo * 0.2) + sueldo;
    }

    @Override
    public String toString() {
        return "El profesor: " + nombre + " " + apellido + "\n" + "Cedula: " + cedula + "\n"
                + "Sueldo basico: " + sueldo + "\n" + "Sueldo total: " + sueldototal;
    }

}
