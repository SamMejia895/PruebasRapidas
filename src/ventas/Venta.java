/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

    public static void main(String args[]) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Mensaje para el usuario
        

        System.out.print("Ingrese concepto de venta: ");
        String str = br.readLine();
//        ventAuto.setConcepto(str);

        System.out.print("Ingrese total de productos: ");
        String totPro = br.readLine();
        int totPro1= Integer.valueOf(totPro);
//        ventAuto.setTotalProductos(totPro);
        Venta ventAuto = new Venta(str, totPro1);
        System.out.println("concepto de venta: " + ventAuto.getConcepto()
                + " total de productos: " + ventAuto.getTotalProductos());

    }
}
