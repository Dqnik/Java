package main;

public class Main {

    public static void main(String[] args) {

        Student Dima;

        Dima=new Student();

        Student Ilia=new Student(0.4f, (byte) 120);

        Student Klon=new Student(Ilia);

        Dima.IQ=(byte)110;

        Dima.printStudent();

        Ilia.printStudent();

        Klon.printStudent();
        Klon.randomizer();
        Klon.printStudent();

        Student klass[] = new Student[10];
        for(int i =0 ; i<klass.length-1; i+=3)
        {
            klass[i]= new Student();
            klass[i+1]= new Student((float)(i*0.1), (byte)(100+i));
            klass[i+2]= new Student(klass[i+1]);
        }
        klass[9]= new Student(0.5f, (byte)120);
        for(int i=0;i<klass.length;i++)
            klass[i].printStudent();

        Student otli4nik=klass[0];
        for(int i=1;i<klass.length;i++)
            if(klass[i].averageMark()>otli4nik.averageMark())
                otli4nik=klass[i];
        System.out.println("Отличник: ");
        otli4nik.printStudent();
        System.out.println("max average mark: " + otli4nik.averageMark() );
        System.out.println("");
        System.out.println("Всего студентов: " + Student.StAmout);
    }
}