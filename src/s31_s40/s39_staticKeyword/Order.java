package s31_s40.s39_staticKeyword;

public class Order {
    String m="m";//instance var
    static String value = "t";


    static{ value += "a"; }
    { value += "c"; }//obje olusturulmadan once sirasiyla static block,static variable,static olmayan blocklar calisir,sonra obje calisir


    public Order() {
        m="h";
        value += "b";
    }

    public Order(String s) {
        value += s;
        m="k";
    }


    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value + order.m);
        }
}
/*
        A. tacb
        B. tacfcbk
        C. tacbfh
        D. tacfcbh
        E. tacftach
        F. Kod calismaz.
        G. Kod calisir ama exception olusur.

 */