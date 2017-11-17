package com.fyakut;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    /**
     * Set;
     * interface kumelerini temsil eder
     * kendiene has metodları yoktur.Koleksiyon metodlarını kullnaır
     *tek şartı aynı koleksiyonda aynı eleman iki kez bulunmaz/list ten ayıran özelliktir
     *somut sııflarda da ayınısı geçerlidir
     *çift kayıtlar olmak istemediğimzde bunu kullanırız
     * @param args
     *
     * HashSet:
     * bu sınıf elemanlarını bir hash tablosunda tutar.elemanlara anahtar ile ulaşılır.hashcode ile tututlur
     * elemanlara gelişmiş for ile ya da iterator ile gezilebilir.
     * elemaları ekleme sırasına göre sıralı olarak barındırmaz.
     * Sırlama onemsz durumlarda kullnılır
     *
     * LinkedHashSet;
     * sıralama istenen durumlarda LinkedHashSet kullnılır.
     * LinkedHashSet hashset ile işlevi aynıdır sadece sıra onemlidir.
     *
     *TreeSet;
     * Bu sınıf SortedSet sınıfından türetilmiştr.Elemanlarını sıralı tutar.
     * Ama sırlama  a-z ye ya da 1..5 dogru olur.Eklenme sıralamasından bağımsızdr.
     * eğer kendi veritiplerimizi sıralamak istiyorsak Compareble interfacesini implement edip comperaToo metonu oveeride etmeli
     *Orn: ogrenci no, ders not, tc no mu neye göre olduğunu sırlamak istediğimzde
     */

    public static void main(String[] args) {

       String[] isim={"ümran","fatma","yakut","ebru","berfin","yakut"};
        HashSet<String>isimkumesi=new HashSet<>();
        for (String i:isim) {
           if( isimkumesi.add(i)){//aynı olanı ikinci kez eklenmesine izin vermez
               System.out.println(i+"eklendi");
           }else{
               System.out.println(i+"eklenmedi");}

    }System.out.println("================gelişmiş for ile================");
        for (String i:isimkumesi){
        System.out.println(i);}

        System.out.println("================iterator ile================");
        Iterator<String> iterator=isimkumesi.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================iterator ile silme================");
        iterator=isimkumesi.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("yakut")){
                iterator.remove();
            }


        }
        for (String s:isimkumesi)
            System.out.println(s);



    }
}
