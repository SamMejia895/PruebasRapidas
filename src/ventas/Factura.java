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
public class Factura {

    String rfc;
    int numFactura;
    
    
    public Factura(int _numFactura, String _rfc) {
        numFactura = _numFactura;
         rfc = _rfc;
    }

    void setRfc(String _rfc) {
        rfc = _rfc;
    }

    String getRfc() {
        return rfc;
    }

    void setnumFactura(int _numFactura) {
        numFactura = _numFactura;
    }

    int getnumFactura() {
        return numFactura;
    }
}
