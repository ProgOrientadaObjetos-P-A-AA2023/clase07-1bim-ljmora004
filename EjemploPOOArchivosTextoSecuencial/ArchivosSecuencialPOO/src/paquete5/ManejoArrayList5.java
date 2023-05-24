package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

public class ManejoArrayList5 {
    public static void main(String[] args) {
        
        String[] lineas = {
        "Tara Hernadez|Contratado|30",
        "Luis Andrade|Factura|35",
        "Ana Juarez|Nombramiento|40"};
        
        String nombre;
        String tipo;
        int edad;
        
        Profesor2[] profesores = new Profesor2[lineas.length];
        
        for (int i = 0; i < lineas.length; i++) {
            ArrayList<String> lineaPorLinea = new ArrayList<>(
                    Arrays.asList(lineas[i].split("\\|")));
            
            nombre = lineaPorLinea.get(0);
            tipo = lineaPorLinea.get(1);
            edad = Integer.parseInt(lineaPorLinea.get(2));
            
            profesores[i] = new Profesor2(nombre, tipo, edad);
            
        }
        
        
        for (int i = 0; i < profesores.length; i++) {
            System.out.printf("%s\n", profesores[i]);    
        }
        
    }
}
