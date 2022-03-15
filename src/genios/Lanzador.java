/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genios;

/**
 * clase ejecutable de la clase Genio
 *
 * @author Gerardo Nemesio <gnmh10@gmail.com>
 */
public class Lanzador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro el objeto genio1
        Genio genio1 = new Genio();
        ////declaro e inicializo los atributos del objeto genio2
        Genio genio2 = new Genio("Einstein", 10000, false);
        //declaro e inicializo la constante inteligencia
        final int inteligencia = 1000;

        //inicializo los atributos del objeto genio1
        genio1.cambiarNombre("Newton");
        genio1.cambiarInteligencia(9500);
        genio1.cambiarEstaVivo(false);
        //muestro por consola el toString del objeto genio2
        System.out.println("Muestro el toString del segundo genio: "
                + genio2.toString());
        /*muestro por consola el metodo que recibe el objeto genio2 por 
        parametro*/
        System.out.println("La suma de inteligencias de "
                + genio1.consultarNombre() + " y " + genio2.consultarNombre()
                + " es: " + genio1.sumarInteligencias(genio2));
        /*muestro por consola el metodo que recibe la constante inteligenia
        por parametro y se la suma a el objeto genio2*/
        System.out.println(inteligencia
                + " puntos de inteligencia sumados a los "
                + genio2.consultarInteligencia() + " puntos de inteligencia de "
                + genio2.consultarNombre() + " son: "
                + genio2.sumarInteligencias(inteligencia) + " puntos.");
    }

}
