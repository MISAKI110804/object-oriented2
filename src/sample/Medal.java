package sample;

public class Medal {
//製品名（金メダルなど）
public String name;
//製品の価格(材料のコスト+(従業員の給料の合計/製品数))*1.2
public int coast;


public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public int getCoast() {
  return coast;
}
public void setCoast(int coast) {
  this.coast = coast;
}
}
