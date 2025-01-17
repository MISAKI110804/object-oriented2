package sample;

public class TV {
  // チャンネル
  private int channel;

  // チャンネルを切り替える
  public void changeChannel(int channel) {
    if (channel <= 0 || 13 <= channel) {
      System.out.println("チャンネルは1~12までの間で設定してください");
      // throw new Exception("チャンネルは1~12までの間で設定してください");
    }
    this.channel = channel;
    System.out.println("チャンネルに切り替わりました");
  }

}
