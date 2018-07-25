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
public class Cliente {

    String nombre;
    int dni;

    void asignarNombre(String _nombre) {
        nombre = _nombre;
    }

    String indicaNombre() {
        return nombre;
    }

    void asignarDni(int _dni) {
        dni = _dni;
    }

    int indicaDni() {
        return dni;
    }

}
