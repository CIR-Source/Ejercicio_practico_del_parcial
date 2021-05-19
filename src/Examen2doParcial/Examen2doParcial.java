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
public class Examen2doParcial {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       videoComunicacion whatsApp = new videoComunicacion("WhatsApp");
       whatsApp.setCantUsuarios(10000);
       whatsApp.setTiempo(Integer.SIZE);
       whatsApp.setNivel("Libre");
       whatsApp.setEstrellas(4.5);
       
       videoComunicacion zoom = new videoComunicacion("Zoom");
       zoom.setCantUsuarios(50000);
       zoom.setTiempo(Integer.SIZE);
       zoom.setNivel("Libre");
       zoom.setEstrellas(4.0);
       
       videoComunicacion meet = new videoComunicacion("Google Meet");
       meet.setCantUsuarios(20000);
       meet.setTiempo(Integer.SIZE);
       meet.setNivel("Libre");
       meet.setEstrellas(4.7);
       
       System.out.println("Los tres programas más usados para las video comunicaciones son:");
       System.out.println("");
       System.out.println(whatsApp);
       System.out.println("");
       System.out.println(zoom);
       System.out.println("");
       System.out.println(meet);
       
    }
    
}
