package main;

import java.util.Random;

public class Wife {
    String name;
    int age;
    float beauty;
    float harmfulness;

    Wife() {
        name = "";
        age = 0;
        beauty = 0;
        harmfulness = 0;
    }

    void randomizer() {
        String[] names = {
                "Aila",
                "Aisha",
                "Alia",
                "Alifia",
                "Amali"
        };
        name = names[(new Random()).nextInt(names.length)];
        age = (new Random().nextInt(10) + 20);
        beauty = (new Random().nextFloat());
        harmfulness = (new Random().nextFloat());
    }
}
