/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    Ciudad ciudad;  

    public Hospital(String nom, int nCamas, double presp, Ciudad ciu) {
        nombre = nom;
        numeroCamas = nCamas;
        presupuesto = presp;
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public void establecerNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
    
}