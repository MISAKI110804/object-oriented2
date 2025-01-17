package sample;

public class Bus extends Car {
int price;

@Override
public void stepOnAccele(){
  super.stepOnAccele();
  this.price = 30 ;
  System.out.println("料金が" + price + "円に増えました");

}
}
