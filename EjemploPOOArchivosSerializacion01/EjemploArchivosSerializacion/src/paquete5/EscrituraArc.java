/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete1.Calificacion;
import paquete3.LecturaArchivoSecuencial;

/**
 *
 * @author SALA I
 */
public class EscrituraArc {
    
    private String nombreArchivo;
    private ObjectOutputStream salida; 
    private Hospital registro;
    private ArrayList<Hospital> lista;

    public EscrituraArc(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista();
        try 
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));

            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        }
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } 
    }
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistro(Hospital h) {
        registro = h;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(registro); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }


    public void establecerLista() {
        LecturaArc l = new LecturaArc(obtenerNombreArchivo());
        l.establecerListaHospitales();
        lista = l.obtenerListaHospitales();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    
    public ArrayList<Hospital> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try 
        {
            if (salida != null) {
                salida.close();
            }
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } 
    } 
}
