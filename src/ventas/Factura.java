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
public class Factura extends Ticket{

    String rfc;
    int numFactura;

    public Factura(String _concepto, int _totProd, boolean _facturar, double _precio) {
        super(_concepto, _totProd, _facturar, _precio);
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
