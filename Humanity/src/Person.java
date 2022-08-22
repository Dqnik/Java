public class Person {
    int age;
    String name;
    Person(){
        age = 23;
        name = "Name";
    }

    Person(String  a, int b){
        name = a;
        age = b;
    }
    void print(){
        System.out.println(age + name);
    }
}
