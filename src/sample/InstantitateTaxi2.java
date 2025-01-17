package sample;

public class InstantitateTaxi2 {
public static void main(String[] args) {
  Taxi taxi = new Taxi();
  taxi.speed = 10;
  taxi.price =1000;//料金は1000円
  taxi.stepOnAccele();
  taxi.payment();//支払う
}
}
