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

    Ticket(String _concepto, int _totProd, boolean _facturar,double _precio){
    super(_concepto,_totProd);
    facturar = _facturar;
    precio = _precio;
    }

    void setFacturar(boolean _facturar) {
        facturar=_facturar;
    }
    
        boolean getFacturar() {
        return facturar;
    }

    double calcularIva(double _precio) {    
        precio=(_precio*.1600);
        return precio;
    }
    
}
