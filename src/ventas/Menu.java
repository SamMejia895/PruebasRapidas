/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author lilisam
 */
public class Menu {

    public static void main(String args[]) throws Exception {
//        implementaciones para leer del teclado

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Venta ventAuto = null;
        int bandera = 0;
        boolean fact1 = false;
        double precio1 = 0.00;

        // Mensaje para el usuario
        System.out.print("Ingrese total de productos: ");
        String totPro = br.readLine();
        int totPro1 = Integer.valueOf(totPro);

        // Mensaje para el usuario
        System.out.print("Ingrese concepto de venta: ");
        String concep = br.readLine();

        try {
            ventAuto = new Venta(concep, totPro1);
            bandera = 1;

        } catch (Exception e) {
            System.out.println("Fallo al crear una instancia de venta" + e);
        }

        if (bandera == 1) {
            // Mensaje para el usuario
            System.out.print("Precio de venta: ");
            String precio = br.readLine();
            precio1 = Double.valueOf(precio);
            int validaFact = 0;

//            Valida que el valor de facturar sea 0 o 1 solo con esos valores funciona
            do {
                if (validaFact == 0) {
                    System.out.print("(0=NO,1=SI) Desea facturar:   ");
                    try {
                        String fact = br.readLine();

                        String result = null;
                        char[] aCaracteres = fact.toCharArray();

                        if (aCaracteres.length == 1) {
                            result = String.valueOf(aCaracteres[0]);
                            switch (result) {
                                case "0":
                                    fact1 = false;
                                    validaFact = 1;
                                    break;
                                case "1":
                                    fact1 = true;
                                    validaFact = 1;
                                    break;
                                default:
                                    System.out.print("Valor incorrecto no es 1 y/o 0 ");
                                    validaFact = 0;
                                    break;
                            }
                        } else {
                            System.out.print("Valor incorrecto no es 1 y/o 0 ");
                            validaFact = 0;
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            } while (validaFact == 0);
        }
// instancia de ticket para empezar a calcular precio total y calcular iva

        Ticket tic = new Ticket(ventAuto.getConcepto(), ventAuto.getTotalProductos(), fact1, precio1);
        double precioTotSinIva = tic.calcularVentaTot(ventAuto.getTotalProductos(), precio1);
        System.out.println("Venta total sin Iva " + precioTotSinIva);

//        Si pidio facturar se instancia Facturar
        if (true == tic.getFacturar()) {
            double iva = tic.calcularIva(precio1);
            double precioTotConIva = tic.calcularIva(precioTotSinIva) + precioTotSinIva;

            System.out.print("Ingrese el número de fatura:");
            String numFac = br.readLine();
            System.out.print("Ingrese el rfc relacionado a la factura");
            String rfcFac = br.readLine();
            Factura fac = new Factura(Integer.valueOf(numFac), rfcFac);
            System.out.print("************************************************************\n");
            System.out.println("Venta Finalizada");
            System.out.print("************************************************************\n");
            System.out.println("Núm. Factura " + fac.getnumFactura());
            System.out.println("RFC que Factura " + fac.getRfc());
            System.out.println("Cantidad de Productos " + tic.getTotalProductos());
            System.out.println("Concepto de Venta " + tic.getConcepto());
            System.out.println("Iva por Producto " + iva);
            System.out.println("Costo Total de la venta " + precioTotConIva);

        } else {
//        Si no pidio facturar se instancia NotaCompra
            System.out.print("Ingrese el número de nota de compra:");
            String numNota = br.readLine();
            System.out.print("Ingrese la dirección de envió:");
            String dirNota = br.readLine();
            NotaCompra not = new NotaCompra(Integer.valueOf(numNota), dirNota);
            System.out.print("************************************************************\n");
            System.out.println("Venta Finalizada");
            System.out.print("************************************************************\n");
            System.out.println("Núm. Nota de Compra " + not.getnumNota());
            System.out.println("Dirección de envió " + not.getDirEnvio());
            System.out.println("Cantidad de Productos " + tic.getTotalProductos());
            System.out.println("Concepto de Venta " + tic.getConcepto());
            System.out.println("Costo Total de la venta " + precioTotSinIva);
        }

    }

}
