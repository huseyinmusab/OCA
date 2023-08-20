package s31_s40.s36_constructorThisKullanimi;

public class Car {
    String marka;
    String model;
    int yil;


    public Car(String mrk, String mdl) {
        marka=mrk;
        model=mdl;
        //ayni isimleri kullansaydik "this.marka=marka" seklinde de yapabilirdik
    }

    public Car(){

    }//parametreli cons olusturunca DEFAULT olan GORUNMEYEN cons yok oluyor, yerine parametreli olan geliyor
     // yani (yukaridai 2 paramtereli cons),ve daha once default cons kullanarak olusturdugumuz car1 objesi hata vermeye
     //basliyor,bundan kurtulmak icin kendimiz MANUEL olarak parametresiz bu sekild bir cons olusturup, yok olan
     //DEFAULT cons in yerine bunu kullanima gecirebiliriz,ve hatayi duzeltmis oluruz

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }
}
