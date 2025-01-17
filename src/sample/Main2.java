package sample;

//実行用クラス
public class Main2 {
  public static void main(String[] args) {

    Employee2[] employee2s = new Employee2[3];

    employee2s[0] = new Employee2("山田", 20000);
    employee2s[1] = new Employee2("海田", 22000);
    employee2s[2] = new Employee2("川田", 24000);

    Material[] materials = new Material[4];

    materials[0] = new Material("金", 10000);
    materials[1] = new Material("銀", 5000);
    materials[2] = new Material("銅", 1000);
    materials[3] = new Material("木", 500);

  //工場の作成
  MedalFactory medalFactory = new MedalFactory();

  //工場を稼働させる
  medalFactory.makeMedal();

  }
}
