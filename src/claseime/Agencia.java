/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseime;

/**
 *
 * @author Vocho
 */
public class Agencia {
    public static void main(String args[]){
    Automovil autoDeportivo = new Automovil();
    Automovil camioneta = new Automovil();
    
//        invocación de métodos

    autoDeportivo.asignaColor("azul");
    camioneta.asignaColor("rojo");
    System.out.println("autoDeportivo color "+ autoDeportivo.indicaColor());
    System.out.println("camioneta colo "+ camioneta.indicaColor());
    }
    
}
