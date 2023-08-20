package s31_s40.s37_constructorCall;
public class Deneme {
    int x=10 , y;

//parametresiz cons
    Deneme(){
        System.out.print(x * y);//this.x li atama yok,diger intance  degerlerini alir=10*0=0
    }

//2 parametreli cons
    Deneme(int x , int y){
        this();
        this.x=x;//this li atama var , yani en tepedeki variable i buraya atamis,yani scope deki degeri(4)
                 //instance daki degere(10) esitliyor,tepedeki 10 yok oldu , yerine artik 4 var
        this.y=10;

        System.out.print(x*y);//IMPORTANT: buradaki durum SCOPE ile ilgili,x=4 tur ama y=5 dir,10 degildir.
                              //cunki java once Scope degeri(constructor ici deger) ile ilgilenir , scope da deger yoksa tepedeki Instance
                              //degerine gider ===>4*5=20 olur
    }

//3 parametreli cons
    Deneme(int x,int y,int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.print(x*z);//3*5 =15
    }


    public static void main(String[] args) {
        Deneme dnm=new Deneme(3,4,5);
        System.out.print(dnm.x * dnm.y);//3*4=12
    }

}
