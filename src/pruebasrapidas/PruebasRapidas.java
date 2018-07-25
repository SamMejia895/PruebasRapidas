/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasrapidas;

/**
 *
 * @author Vocho
 */
public class PruebasRapidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Reyna Maria de Jesus";
        String espa = " ";
        String result = null;
        char c = espa.charAt(0);
        char[] aCaracteres = cadena.toCharArray();

        for (int x = 0; x < aCaracteres.length; x++) {
            if (x == 0) {
                System.out.println("[" + x + "] " + aCaracteres[x]);
                result = String.valueOf(aCaracteres[x]);
            }
            if (aCaracteres[x] == c) {
                System.out.println("[" + x + "] " + aCaracteres[(x + 1)]);
                result = result + String.valueOf(aCaracteres[x+1]);
            }

        }
        System.out.println(cadena);
        System.out.println(result.toUpperCase());
    }

}
