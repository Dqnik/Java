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

    void SayHi(){
        System.out.println("Hi");
    }

    @Override
    public void birthday(){
        super.birthday();
        money = 0;
    }
}
