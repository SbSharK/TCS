import java.util.Scanner;
import java.lang.*;
public class Solution6
{
static int total=0;
public static void main(String[] args)
{
//code to read values
//code to call required method
//code to display the result
Institution i[] = new Institution[4];
Scanner sc=new Scanner(System.in);
for(int iter=0;iter<4;iter++){
  int a = sc.nextInt();
  sc.nextLine();
  String b = sc.nextLine();
  String c = sc.nextLine();
  int d = sc.nextInt();
  sc.nextLine();
  String e = sc.nextLine();
  i[iter] = new Institution(a,b,c,d,e);
}
String loc = sc.nextLine();
String nm = sc.nextLine();
System.out.println(findNumClearancedByLoc(i,loc));
Institution temp = updateInstitutionGrade(i,nm);
System.out.println(temp.institutionName+"::"+temp.grade);
}

public static int findNumClearancedByLoc(Institution[] instArray, String location)
{
//method logic

for(Institution i:instArray){
  if(i.location.equalsIgnoreCase(location)){
    total+=i.noOfStudentsCleared;
  }
}
if(total!=0){
  return total;
}
return 0;
}

public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
{
//method logic
for(Institution i:instArray){
  if(i.institutionName.equalsIgnoreCase(instName)){
    int rating = Integer.parseInt(i.noOfStudentsPlaced)*100/i.noOfStudentsCleared;
    if(rating>=80){
      i.grade = "A";
    }
    else{
      i.grade = "B";
    }
    return i;
  }
}
return null;
}
}
class Institution
{
  int institutionId;
  String institutionName;
  String noOfStudentsPlaced;
  int noOfStudentsCleared;
  String location;
  String grade;

  public Institution(int id,String name,String placed,int cleared,String location){
    this.institutionId = id;
    this.institutionName = name;
    this.noOfStudentsPlaced = placed;
    this.noOfStudentsCleared = cleared;
    this.location = location;
  }
//code to build Institution class
}
