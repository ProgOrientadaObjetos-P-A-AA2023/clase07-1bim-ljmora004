/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import paquete1.Calificacion;
import paquete1.Profesor;
import paquete3.EscrituraArchivoSecuencial;
import paquete3.LecturaArchivoSecuencial;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        String nombreArchivo = "hospitales.data";

        Ciudad c1 = new Ciudad("Loja", 450000);
        Ciudad c2 = new Ciudad("Cuenca", 150000);
        Ciudad c3 = new Ciudad("Quito", 4456000);
        Ciudad c4 = new Ciudad("Paris", 7750000);
        Ciudad c5 = new Ciudad("Londres", 7822000);
        
        Hospital h1 = new Hospital("Isidro Ayora", 15, 12500.33, c1);
        Hospital h2 = new Hospital("San Jose", 366, 450000.20, c2);
        Hospital h3 = new Hospital("Torre Medica", 800, 785454.33, c3);
        Hospital h4 = new Hospital("La Noire 26", 900, 248786.34, c4);
        Hospital h5 = new Hospital("St. Thomas", 256, 4564564.22, c5);

        Hospital[] lista = {h1, h2, h3, h4, h5};

        EscrituraArc archivo = new
         EscrituraArc(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArc lectura = new LecturaArc(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
    }
}
