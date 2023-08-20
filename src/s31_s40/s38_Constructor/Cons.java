package s31_s40.s38_Constructor;

//CLASS
public class Cons {
    public static int length=0; //STATIC VARIABLE LAR GOKTEKI AY A benzer , HERKES icin aynidir
}



//CLASS(public degil, bilerek, normal inteelij formatindan farkli yapmak icin boyle yapmak zorunda kaldik)
class ConsLength {
    //main method olsa bile once static variable lar ya da static objelerden ya da static block tan sirasiyla baslayacaz
    static Cons cons1=new Cons();
    static Cons cons2=new Cons();

    //static block
    static  {
        System.out.print(cons1.length);
    }
    public static void main(String[] args) {

        cons1.length=2;
        cons2.length=8;

        System.out.println(cons1.length);//08
    }
}
            /*
            A. 02
            B. 08
            C. 2
            D. 8
            E. Kod calismaz.
            F. Kod calisir ancak exception olusur.
             */



