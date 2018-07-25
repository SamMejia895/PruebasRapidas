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
public class NotaCompra extends Ticket {

    String dirEnvio;
    int numNota;

    public NotaCompra(String _concepto, int _totProd, boolean _facturar, double _precio) {
        super(_concepto, _totProd, _facturar, _precio);
    }

    void setRfc(String _dirEnvio) {
        dirEnvio = _dirEnvio;
    }

    String getRfc() {
        return dirEnvio;
    }

    void setnumNota(int _numNota) {
        numNota = _numNota;
    }

    int getnumNota() {
        return numNota;
    }

}
