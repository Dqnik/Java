package main;

import java.util.Random;

public class Student {

    String nickName;

    float lazyness;

    byte IQ;

    int exams;

    int marks[];

    static int StAmout;

    Student() {

        nickName="Super Mario";

        lazyness=0.5f;

        IQ=(byte)100;

        exams=4;

        marks=new int[exams];

        for (int i = 0; i < exams; i++) {

            marks[i]=8;

        }

        StAmout+=1;

    }

    Student(float lazyness, byte iq){

        nickName="Goga";

        this.lazyness=lazyness;

        IQ=iq;

        exams=5;

        marks=new int[exams];

        for (int i = 0; i < exams; i++) {

            marks[i]=9;

        }

        StAmout+=1;

    }

    Student(Student KtoTo){

        nickName=KtoTo.nickName;

        lazyness=KtoTo.lazyness;

        IQ=KtoTo.IQ;

        exams=KtoTo.exams;

        marks=new int[exams];

        for (int i = 0; i < exams; i++) {

            marks[i]=KtoTo.marks[i];

        }

        StAmout+=1;

    }

    void printStudent(){

        System.out.println("Student's name is "+this.nickName);

        System.out.println("Student's lazyness is "+this.lazyness);

        System.out.println("Student's IQ is "+this.IQ);

        System.out.println("Student had "+this.exams+" exams");

        for (int i = 0; i < exams; i++)

            System.out.print(" "+marks[i]);

        System.out.println("");
        System.out.println("");
    }

    void randomizer()
    {
        String slovari[]= {"WikroGaming", "Dima21","Chupip", "Dqnik","autist"};
        nickName= slovari[(new Random()).nextInt(slovari.length)];
        lazyness= (new Random()).nextFloat();
        IQ=(byte)((new Random()).nextInt(47)+80);
        exams = (new Random()).nextInt(10);
        marks = new int[exams];
        for (int i = 0; i <exams; i++)
            marks[i]= (new Random()).nextInt(11);
    }
    int sumMarks()
    {
        int sum = 0;
        for(int i = 0; i<exams; i++ )
            sum += marks[i];
        return sum;
    }
    double averageMark()
    {
        return (sumMarks()/exams);
    }
    int MaxMark()
    {
        int max=0;
        for(int i=0; i<exams;i++)
            if(marks[i]>max)
                max=marks[i];
        return max;
    }
    int MinMark()
    {
        int min=10;
        for(int i=0;i<exams;i++)
            if(marks[i]<min)
                min=marks[i];
        return min;
    }

    public byte getIQ()
    {
        return  IQ;
    }

    public  void setIQ(byte NewIQ)
    {
        if(NewIQ > 50)
            IQ=NewIQ;
    }

    public float getLazyness() {
        return lazyness;
    }

    public void setLazyness(float lazyness) {
        if(this.lazyness > 0 && this.lazyness < 1)
            this.lazyness = lazyness;
    }

    public int getExams() {
        return exams;
    }

    public int getMark(int id){
        if(id >= 0 && id <= exams)
            return marks[id];
        return -1;
    }

    public void setMark(int newMark, int id){
        if(id >= 0 && id < exams && newMark>0 && newMark<11)
            marks[id] = newMark;
    }

    public void setExams(int newExams){
        if(newExams>=0 && newExams<11 && exams!=newExams)
        {
          int tmp[] = new int[exams];
            for (int i = 0; i < exams; i++)
                tmp[i]= marks[i];
            marks= new int[newExams];
            int min = (exams < newExams)?(exams):(newExams);
            for (int i = 0; i < min ; i++)
                marks[i] = tmp[i];
            exams= newExams;
        }
    }
}