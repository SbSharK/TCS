import java.util.*;
import java.lang.*;

class Solution3{
  static int tests=0;
  public static int findTestPassedByEnv(AutonomousCar ac[],String env){
    for(AutonomousCar a:ac){
      if(a.environment.equals(env)){
        tests+=a.noOfTestsPassed;
      }
    }
    if(tests!=0){
      return tests;
    }
    else{
      return 0;
    }
  }
  public static int rating(AutonomousCar a){
    return ((a.noOfTestsPassed*100)/a.noOfTestsConducted);
  }
  public static String updateCarGrade(AutonomousCar ac[],String br){
    for(AutonomousCar a:ac){
      if(rating(a)>=80){
        a.grade = "A1";
      }
      else{
        a.grade = "B2";
      }
    }
    for(AutonomousCar a:ac){
      if(a.brand.equals(br)){
        return a.brand+"::"+a.grade;
      }
    }
    return "null";
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    AutonomousCar[] ac = new AutonomousCar[4];
    for(int i = 0 ; i < 4 ; i++ ){
      int id = sc.nextInt();
      sc.nextLine();
      String brand = sc.nextLine();
      int cond = sc.nextInt();
      int pass = sc.nextInt();
      sc.nextLine();
      String env = sc.nextLine();
      ac[i] = new AutonomousCar(id,brand,cond,pass,env);
    }
    String env = sc.nextLine();
    String brand = sc.nextLine();
    System.out.println(findTestPassedByEnv(ac,env));
    System.out.println(updateCarGrade(ac,brand));
  }
}

class AutonomousCar{
  int carId;
  String brand;
  int noOfTestsConducted;
  int noOfTestsPassed;
  String environment;
  String grade;

  public AutonomousCar(int id,String brand,int cond,int pass,String env){
    this.carId = id;
    this.brand = brand;
    this.noOfTestsConducted = cond;
    this.noOfTestsPassed = pass;
    this.environment = env;
  }

}
