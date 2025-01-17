package sample;

public class Employee {
  //属性
  public String name;
  public int id;
  public double salary;

  //名前のgetterを作成
  public String getName(){
    return name ;
  }

  //名前のsetterを作成
  public void setName(String name){
    this.name = name;
  }


  //idのgetterを作成
  public int getId(){
    return id ;
  }

  //idのsetterを作成
  public void setId(int id){
    this.id = id ;
  }

  //給与のgetterを作成
  public double getSalary(){
    return salary;
  }

  //給与のsetter
  public void setSalary(double salary){
    this.salary = salary;
  }



}
