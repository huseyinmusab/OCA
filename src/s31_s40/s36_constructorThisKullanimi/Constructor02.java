package s31_s40.s36_constructorThisKullanimi;

public class Constructor02 {
    int num;


//tek parametreli cons
    public Constructor02(int num) {
        // INSERT CODE HERE
        this.num = num;
    }


    public static void main(String[] args) {
        //Constructor02 constructor02= new Constructor02(50); =====>
        //constructor02.num === new Constructor02(50).num)

        System.out.println(new Constructor02(50).num);
    }
}

        /*
        A. num = num;
        B. num = this.num;
        C. this.num = num;
        D. Yukaridakilerden hicbiri ==50 DOGRU CEVAP
         */
