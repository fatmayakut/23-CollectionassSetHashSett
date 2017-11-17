package com.fyakut;

public class Ogrenci implements Comparable<Ogrenci>{

    private int ogrNo;
    private int ogrNot;

    public Ogrenci(int ogrNo, int ogrNot) {
        this.ogrNo = ogrNo;
        this.ogrNot = ogrNot;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrNo=" + ogrNo +
                ", ogrNot=" + ogrNot +
                '}';
    }

    @Override
    public int compareTo(Ogrenci o) {//ogrNo ya göre sıralama yap
        if(this.ogrNo==o.ogrNo)
            return 0;
        else if (this.ogrNo>o.ogrNo)
            return -1;
        else
            return 1;
    }
}
