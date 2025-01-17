package sample;

public class Polymorrphism2 {
public static void main(String[] args) {
  
  Car car = null; //Car型の変数宣言のみ行う

  car = new Taxi();//宣言したcarにTaxiオブジェクトの参照を代入
  car.stepOnAccele();//Taxi
  car= new Bus();
  car.stepOnAccele();
}
}
