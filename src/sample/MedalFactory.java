package sample;

public class MedalFactory {
//工場で働く従業員
private Employee2[] employee2 ;

public void makeMedal(){
  Medal medal = new Medal();
  Material[] materials = new Material[4];

  //従業員の給料の合計の変数宣言、初期化
  int totalSalaly = 0;
  
  //従業員の給料の合計を求める
  for(Employee2 employee2 :employee2){
    totalSalaly = totalSalaly + employee2.getSalary();
  }

  //製品（メダル）を格納する配列宣言
  Medal[] medals = new Medal[4];

  //メダルを作成するループ
  for(Material material :materials){
    if(material == materials[0]){
      System.out.println("金メダルを作成しました。");
      
    }else if(material == materials[1]){
      System.out.println("銀メダルを作成しました。");
    }else if(material == materials[2]){
      System.out.println("銅メダルを作成しました。");
    }else{
      System.out.println("不良品を作成しました。");
    }
  }
}
}


