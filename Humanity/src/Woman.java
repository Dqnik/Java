public class Woman extends Person{
    float beauty;
    byte bitchness;

    Woman(){
        super();
        beauty=0.9f;
        bitchness=100;
    }

    Woman(String v, int d, float c, byte h){
        super(v, d);
        beauty = c;
        bitchness = h;
    }
    void print(){
        super.print();
        System.out.println(beauty + bitchness);
    }

    void  MakeUp(){
        beauty *= 2;
    }
}
