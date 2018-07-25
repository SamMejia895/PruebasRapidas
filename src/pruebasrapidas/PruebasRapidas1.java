/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasrapidas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vocho
 */
public class PruebasRapidas1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public static <T> void removeDuplicate(List<T> list) {
        Set<T> set = new HashSet<T>();
        List<T> newList = new ArrayList<T>();
        for (Iterator<T> iter = list.iterator(); iter.hasNext();) {
            Object element = iter.next();
            if (set.add((T) element)) {
                newList.add((T) element);
            }
        }
        list.clear();
        list.addAll(newList);
    }

    public static void main(String[] args) {

//        List<Object[]> cryotopList = new ArrayList<>();
//        List<Object[]> newcryotopList = new ArrayList<>();
//        String s1 = "3";
//        String s2 = "1";
//        String s3 = "2";
//        String s4 = "1";
//        Object[] obj = new Object[]{s1};
//        Object[] obj1 = new Object[]{s2};
//        Object[] obj2 = new Object[]{s3};
//        Object[] obj3 = new Object[]{s4};
//
//        cryotopList.add(obj);
//        cryotopList.add(obj1);
//        cryotopList.add(obj2);
//        cryotopList.add(obj3);
//
//        removeDuplicate(cryotopList);
//        System.out.println(cryotopList);
//boolean breakLoop = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("antes del break" + i);
            if (i == 5) {
                System.out.println("llego al break" + i);
                break;
            }
            System.out.println("despues del break" + i);
        }

//        System.out.println(cryotopList.size());
//        System.out.println(newcryotopList.size());
//        System.out.println("valor: " + (cryotopList.size() - newcryotopList.size()));
//        boolean LaneBlocker = true;
//        if (LaneBlocker) {
//            
//            int np = 16;
//            System.out.println(np);
//
//        } else { //if encab
//            
//            int np = 17;
//            System.out.println(np);
//        }
//        String s3 = "JournalDev";
//        int start=1;
//        char end = 5;
//        
//        
//        
//       System.out.println(start+end);
//        System.out.println(s3.substring(start,end));
//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println(s1 == s2);
//        System.out.println(result.toUpperCase());
//        HashSet shortSet = new HashSet();
//        for (short i = 0; i < 100; i++) {
//            shortSet.add(i);
//            shortSet.remove(i );
//        }
//        System.out.println(shortSet.size());
    }

}
