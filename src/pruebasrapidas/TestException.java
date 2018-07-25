/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.journaldev.exceptions;
package pruebasrapidas;

/**
 *
 * @author Vocho
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestException {

    private TestException() {
    }

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
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        // output : [Bart, Lisa, Marge, Marge, Barney, Homer, Maggie]
        TestException.removeDuplicate(list);
        System.out.println(list.size());
        // output : [Bart, Lisa, Marge, Barney, Homer, Maggie]
    }

//    public static void main(String[] args) {
//        try{
//           System.out.print("hola");
//        }finally{
//        System.out.print("hola2");
//        }
//    }
}
