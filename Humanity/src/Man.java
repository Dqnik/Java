public class Man extends Person{
    double money;
    Man(){
        super();
        money=100000;
    }
    void print(){
        super.print();
        System.out.println(money);
    }
}
