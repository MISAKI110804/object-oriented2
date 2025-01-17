package sample;

public class Material {
//材料名
public String name;
//コスト(原価)
public int coast;

public Material(String string, int i) {
}

//getterとsetterを作成
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
