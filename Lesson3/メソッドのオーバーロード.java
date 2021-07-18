class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27);
    printData(fullName("Jhon", "chirs", "smith"), 65);
  }
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }
  public static String fullName(String firstName, Stirng lastName) {
    return firstName + " " + lastName;
  }
  public static String fullName(String firstName, Stirng middleName, Stirng lastName) {
    return firstName + " " + middleName + " " + lastName;
  }
}
