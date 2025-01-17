package sample;

public class Car {
private int speed;//速度を表す属性
private String name;//名前を表す属性

//getterとsetter
public String getName(){
  return this.name;
}

public void setName(String name) {
  this.name = name;
}

public int getSpeed(){
  return speed;
}

public void setSpeed(int speed){
  this.speed =speed;
}

//引数なしのコンストラクタ
public Car(){
}
//引数ありのコンストラクタ
public Car(int speed,String name){
  this.speed = speed;
  this.name = name;
}
//アクセル踏む操作
public void stepOnAccele(){
  speed=speed +10 ;
  System.out.println("スピードが"+speed+"km/hに増えました");
}
//ブレーキを踏む操作
public void stepOnBrake(){
  speed=speed -10 ;
  System.out.println("スピードが"+speed+"km/hに減りました");
}
}
