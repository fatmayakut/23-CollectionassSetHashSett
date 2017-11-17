package com.fyakut;

import org.omg.CORBA.Object;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOgrenciExample {

    public static void main(String... args){
//ogrenci tipinde ekleme yap sıralama için comparable implement et
        TreeSet<Ogrenci> o=new TreeSet<>(Collections.reverseOrder());
        o.add(new Ogrenci(1,45));
        o.add(new Ogrenci(7,60));
        o.add(new Ogrenci(3,49));
        o.add(new Ogrenci(5,90));

        Iterator<Ogrenci> iterator=o.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
