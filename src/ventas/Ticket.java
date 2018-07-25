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
public class Ticket extends Venta {

    boolean facturar;
    double precio;
    double ventaTot;

    Ticket(String _concepto, int _totProd, boolean _facturar, double _precio) {
        super(_concepto, _totProd);
        facturar = _facturar;
        precio = _precio;
    }


    boolean getFacturar() {
        return facturar;
    }

    double calcularVentaTot(int _totProd, double _precio) {
        ventaTot = _totProd * _precio;
        return ventaTot;
    }

    double calcularIva(double _ventaTot) {
        precio = (_ventaTot * .1600);
        return precio;
    }

}
