/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasrapidas;

import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Vocho
 *
 *
 *
 */
public class test {

    public static void main(String args[]) throws Exception {
//        int num1 = 50;
//        int num2 = 120;
////        try{
////        int i = 5/0;
////        }
////        catch(Exception e){
////        throw new Exception();
////        }
////        finally{
////        System.out.print("in finally");
////                }
//        for (int j = 0; j < 100; j++) {
//            int x = (int) Math.floor(Math.random() * (num1));
////            int numAleatorio = (int) Math.floor(Math.random() * (num1 - num2) + num2);
//            System.out.println(x);
////        }
////        int i = 3;
////        int j = 6;
////        int x = (int) Math.floor(Math.random() * (i - j) + j);
//            int i = 3;
//////        int ran = (int) (x+1);
//            System.out.println("x " + x);
//            System.out.println("i " + i);
////        System.out.println("ran " + ran);
//            int res=x % i;
//            if (res > 2) {
//                res = 0;
//            }
//            System.out.println("result " + res);
//        }
//         

String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
System.out.println("result " + filename+ ".png");
//File fileFoto = new File(path, "/" + filename + ".png");
    }
}
