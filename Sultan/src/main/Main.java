package main;

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
        for (int i = 0; i < Halifat.length; i++) {
            if (st3.MaxBeauty() < Halifat[i].MaxBeauty()) {
                st3 = Halifat[i];
            }
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Султаны вне халифата:");

        System.out.println("");

        st.printSultan();

        st1.printSultan();

        st2.printSultan();
        st2.randomizer();
        st2.printSultan();

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Султаны из халифата:");

        System.out.println("");

        for (int i = 0; i < Halifat.length; i++) {
            st2.randomizer();
            Halifat[i].printSultan();
        }
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

        System.out.printf("Султан с самой красивой женой в Халифате - %s. Его самая красивая жена: %s, ее коэфицент красоты: %.3f",st3.name,st3.MBWN,st3.MaxBeauty());
        System.out.println("");

        System.out.println("");

        System.out.println("Всего султанов: " + Sultan.SultAmout);
    }
}
