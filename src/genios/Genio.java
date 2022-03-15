/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genios;

/**
 * clase Genio que contiene sus metodos
 *
 * @author Gerardo Nemesio <gnmh10@gmail.com>
 * @version 1.0
 */
public class Genio {

    String nombre;
    int inteligencia;
    boolean vivo;

    /**
     * constructor sin parametros
     */
    public Genio() {
        this.nombre = null;
        this.inteligencia = 0;
        this.vivo = false;
    }

    /**
     * constructor con parametros
     *
     * @param nombre Nombre del genio
     * @param inteligencia Inteligencia del genio
     * @param vivo Si esta vivo o no
     */
    public Genio(String nombre, int inteligencia, boolean vivo) {
        this.nombre = nombre;
        this.inteligencia = inteligencia;
        this.vivo = vivo;
    }

    /**
     * getter del nombre del genio
     *
     * @return Retorna el nombre del genio
     */
    public String consultarNombre() {
        return this.nombre;
    }

    /**
     * getter de la inteligencia del genio
     *
     * @return Retorna la inteligencia del genio
     */
    public int consultarInteligencia() {
        return this.inteligencia;
    }

    /**
     * getter del estado del genio
     *
     * @return Retorna si esta vivo el genio
     */
    public boolean consultarEstaVivo() {
        return this.vivo;
    }

    /**
     * setter que cambia el nombre del genio
     *
     * @param nombre Nombre del genio
     */
    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * setter que cambia la inteligencia del genio
     *
     * @param inteligencia Inteligencia del genio
     */
    public void cambiarInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /**
     * setter que cambia el estado del genio
     *
     * @param vivo Si esta vivo el genio o no
     */
    public void cambiarEstaVivo(boolean vivo) {
        this.vivo = vivo;
    }

    /**
     * metodo que le suma unos puntos de inteligencia a la inteligencia de un
     * genio
     *
     * @param inteligencia Inteligencia del genio
     * @return Retorna la inteligencia del genio sumado a otra inteligencia
     */
    public int sumarInteligencias(int inteligencia) {
        return this.inteligencia + inteligencia;
    }

    /**
     * metodo que le suma los puntos de inteligencia de un genio pasado por
     * parametro al del genio especificado
     *
     * @param genio objeto de la clase Genio
     * @return Retorna la suma de las inteligencias de dos genios
     */
    public int sumarInteligencias(Genio genio) {
        return this.inteligencia + genio.consultarInteligencia();
    }

    /**
     * metodo toString que devuelve los atributos del genio referenciado
     *
     * @return Retorna una cadena con los atributos de un objeto de la clase
     * genio
     */
    @Override
    public String toString() {
        return "Genio{" + "nombre=" + nombre + ", inteligencia="
                + inteligencia + ", vivo=" + vivo + '}';
    }
}
