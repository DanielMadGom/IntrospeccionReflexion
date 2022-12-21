/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introspeccionreflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author Daniel Madrid
 */
public class IntrospeccionReflexion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String clase;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre de la clase para ver sus caracterísricas:");
        clase = scan.nextLine();
        
        try {
            Class datosClase = Class.forName(clase);
            System.out.println("Caracteristicas de la clase " + datosClase.getName() + ":");
            System.out.println("\n");
            
            System.out.println("Nombre de la clase (getName())-> " + datosClase.getName());
            System.out.println("\n");
            
            System.out.println("Constructores de la clase (getConstructors()):");
            Constructor constClase[] = datosClase.getConstructors();
            for(int i=0; i<constClase.length; i++) {
                System.out.println(constClase[i]);
            }
            System.out.println("\n");
            
            System.out.println("Campos de la clase (getFields()):");
            Field fieldsClase[] = datosClase.getFields();
            for(int i=0; i<fieldsClase.length; i++) {
                System.out.println(fieldsClase[i]);
            }
            System.out.println("\n");
            
            System.out.println("Metodos de la clase (getMethods()):");
            Method methodClase[] = datosClase.getMethods();
            for(int i=0; i<methodClase.length; i++) {
                System.out.println(methodClase[i]);
            }
        } catch(ClassNotFoundException e) {
            System.out.println("¡ERROR! El nombre de la clase no es válido");
        }
    }
}