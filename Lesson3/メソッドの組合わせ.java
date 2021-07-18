class Main {
public static void main(String[] args) {
  printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
  printData(fullName("john", "chris", "smith"), 65, 1.75, 80.0);
}
public static void printData(string fullName, int age, double height, double weight) {
  System.out.println("私の名前は"+name+"です");
  System.out.println("年齢は"+age+"です");
  System.out.println("身長は"+height+"です");
  System.out.println("体重は"+weight+"です");
  double bmi = bmi(height, weight);
  System.out.println("BMIは"+bmi+"です");
}
public static String fullName(String firstName, String lastName) {
  return firstName + " " + lastName;
}

public static String fullName(String firstName, String middleName, String lastName) {
  return firstName + " " + middleName + " " + lastName;
}

public static double bmi(double height, double weight) {
  return weight / height / height;
}
}
