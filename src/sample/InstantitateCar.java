package sample;

public class InstantitateCar {
public static void main(String[] args) {
  Car estima = new Car();

  // estima.speed = 30 ;
   estima.setSpeed(30); //これを呼び出さないといけない
   estima.setName("エスティマ");
   System.out.println("スピードは"+ estima.getSpeed());
   System.out.println("車名は"+estima.getName());
}
}
