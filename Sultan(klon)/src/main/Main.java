package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sultan st = new Sultan();

        Sultan st1 = new Sultan("Murad 2", (byte) 35);

        Sultan st2 = new Sultan(st1);

        Sultan[] Halifat = new Sultan[10];
        for (int i = 0; i < Halifat.length; i++) {
            st2.randomizer();
            Halifat[i] = new Sultan(st2);
        }

        Sultan st3 = new Sultan(12f);
        for (Sultan sultan : Halifat) {
            if (st3.MaxBeauty() < sultan.MaxBeauty()) {
                st3 = sultan;
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Султаны вне халифата:");

        System.out.println("");

        st2.randomizer();

        ArrayList<Sultan> VNH = new ArrayList<>();

        VNH.add(st);

        VNH.add(st1);

        VNH.add(st2);

        for (Sultan sut: VNH)
            sut.printSultan();

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Султаны из халифата:");

        System.out.println("");

        ArrayList<Sultan> Hal = new ArrayList<>(Arrays.asList(Halifat));

        for (Sultan h : Hal)
            h.printSultan();

        System.out.println("-----------------------------------------------------------------------------------------");

        Sultan MH = Halifat[0];
        for (int i = 1; i < Halifat.length; i++)
            if (Halifat[i].SultanHappiness() > MH.SultanHappiness())
                MH = Halifat[i];

        System.out.println("Самый счастливый султан из Халифата - " + MH.name);

        Sultan MW = Halifat[0];
        for (int i = 1; i < Halifat.length; i++)
            if (Halifat[i].wealth > MW.wealth)
                MW = Halifat[i];

        System.out.println("");

        System.out.printf("Самый богатый султан в Халифате - %s. Его состояние : %.2f миллионов золота", MW.name, MW.wealth);
        System.out.println("");

        double MBW = Halifat[0].MaxBeauty();
        for (int i = 1; i < Halifat.length; i++)
            if (Halifat[i].MaxBeauty() > MBW)
                MBW = Halifat[i].MaxBeauty();

        System.out.println("");

        System.out.printf("Султан с самой красивой женой в Халифате - %s. Его самая красивая жена: %s, ее коэфицент красоты: %.2f",st3.name,st3.MBWN,st3.MaxBeauty());
        System.out.println("");

        System.out.println("");

        System.out.println("Всего султанов: " + Sultan.SultAmout);
    }
}
