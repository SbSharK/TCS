import java.util.*;

class Solution1{
  static int numInp;
static faculty findFacultyWithSecondLargestSalary(faculty fac[]){
  double arr[] = new double[numInp];
  int i=0;
  for(faculty f:fac){
    arr[i] = f.salary;
    i++;
  }
  Arrays.sort(arr);
  for(faculty f:fac){
    if(arr[numInp-2]==f.salary)
    {
      return f;
    }
  }
  return null;
}

static faculty findFourthLargestFacultyByAge(faculty fac[]){
  int arr[] = new int[numInp];
  int i = 0;
  for(faculty f:fac){
    arr[i] = f.age;
    i++;
  }
  Arrays.sort(arr);
  for(faculty f:fac){
    if(arr[numInp-4] == f.age){
      return f;
    }
  }
  return null;
}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    numInp = sc.nextInt();
    faculty[] fac = new faculty[numInp];
    for(int i=0;i<numInp;i++){
      int a = sc.nextInt();
      sc.nextLine();
      String b = sc.nextLine();
      double c = sc.nextDouble();
      sc.nextLine();
      String d = sc.nextLine();
      int e = sc.nextInt();
      sc.nextLine();
      String f = sc.nextLine();
      fac[i] = new faculty(a,b,c,d,e,f);
    }
    faculty t1 = findFacultyWithSecondLargestSalary(fac);
    faculty t2 = findFourthLargestFacultyByAge(fac);
    System.out.println(t1.id+"\n"+t1.name+"\n"+t1.salary+"\n"+t1.designation+"\n"+t1.age+"\n"+t1.stream);
    System.out.println(t2.id+"\n"+t2.name+"\n"+t2.salary+"\n"+t2.designation+"\n"+t2.age+"\n"+t2.stream);
  }
}

class faculty{
  int id;
  String name;
  double salary;
  String designation;
  int age;
  String stream;

  public faculty(int a,String b,double c,String d,int e,String f){
    this.id = a;
    this.name = b;
    this.salary = c;
    this.designation = d;
    this.age = e;
    this.stream = f;
  }
}
