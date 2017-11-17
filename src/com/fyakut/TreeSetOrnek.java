package com.fyakut;

import java.util.Collections;
import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetOrnek {


    public static void main(String... args){

        String[] isim={"umran","fatma","yakut","ebru","berfin","yakut","remo"};
        TreeSet<String> isimkumesi=new TreeSet<>(Collections.reverseOrder());///Z-A ya yazma sıralama

        for (String s:isim){
            if (isimkumesi.add(s)){
                System.out.println(s+"eklendi");
            }
            else{
                System.out.println(s+"eklenemedi");
            }
        }

        System.out.println("============gelişmiş for ile=============");
        for (String s:isimkumesi) {
            System.out.println(s);
        }
        System.out.println("============iterator for ile=============");
        Iterator<String> iterator=isimkumesi.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
