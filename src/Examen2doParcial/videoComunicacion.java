/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2doParcial;

/**
 *
 * @author PC
 */
public class videoComunicacion {
    private String nombre;
    private int cantUsuarios;
    private Integer tiempo;
    private String nivel;
    private double estrellas;

    public videoComunicacion() {}

    public videoComunicacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantUsuarios() {
        return cantUsuarios;
    }

    public void setCantUsuarios(int cantUsuarios) {
        this.cantUsuarios = cantUsuarios;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(double estrellas) {
        this.estrellas = estrellas;
    }

    public videoComunicacion(String nombre, int cantUsuarios, Integer tiempo, String nivel, double estrellas) {
        this.nombre = nombre;
        this.cantUsuarios = cantUsuarios;
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El nombre del programa es: ").append(nombre);
        sb.append(System.getProperty("line.separator"));
        sb.append("Su cantidad de usuarios es: ").append(cantUsuarios);
        sb.append(System.getProperty("line.separator"));
        sb.append("Su tiempo es: ").append(tiempo);
        sb.append(System.getProperty("line.separator"));
        sb.append("Su nivel es: ").append(nivel);
        sb.append(System.getProperty("line.separator"));
        sb.append("Su calificación en estrellas es: ").append(estrellas);
        sb.append(System.getProperty("line.separator"));
        sb.append("Su calificación en estrellas es: ").append(cantUsuarios * tiempo * estrellas );
        return sb.toString();
    }
    
}
