public class Main {
    public static void main(String[] args) {
        Person[] party = new Person[10];
        for (int i = 0; i < party.length; i+=2) {
            party[i] = new Man();
            party[i+1] = new Woman();
        }
        for (Person p : party) {
            p.print();
        }

        for (Person p: party) {
            p.SayHi();
        }
    }
}