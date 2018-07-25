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
public class Venta {

    String concepto;
    int totProd;

    
    Venta (String _concepto, int _totProd){
    concepto = _concepto;
    totProd= _totProd;
    }

    private Venta() {       
    }
    
    void setTotalProductos(String _totProd) {
        int _totProd1 = Integer.valueOf(_totProd);
        totProd = _totProd1;
    }

    int getTotalProductos() {
        return totProd;
    }

    void setConcepto(String _concepto) {
        concepto = _concepto;
    }

    String getConcepto() {
        return concepto;
    }

}
