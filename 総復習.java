class Main {
  public static void main(String[] args) {
    //名前
    String name = "KenInoue";
    //年齢
    int age = 23;
    //身長
    double height = 1.59;
    //体重
    double weight = 47.0;
    //BMI
    double bmi = weight / height / height;
    //各情報の出力
    System.out.println("名前は"+name+"です");
    System.out.println("年齢は"+age+"です");
    System.out.println("身長は"+height+"mです");
    System.out.println("体重は"+weight+"kgです");
    System.out.println("BMIは"+bmi+"です")
  }
}
