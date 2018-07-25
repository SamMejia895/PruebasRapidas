/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author Vocho
 */
public class NotaCompra {

    String dirEnvio;
    int numNota;

    public NotaCompra(int _numNota, String _dirEnvio) {
        numNota = _numNota;
        dirEnvio = _dirEnvio;
    }

    String getDirEnvio() {
        return dirEnvio;
    }

    int getnumNota() {
        return numNota;
    }

}
