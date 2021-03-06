import java.util.*;
import java.lang.*;

class Solution2{
  static int avg=0,count=0;
  public static int percentage(navalVessel n){
    int ans = (n.noOfVoyagesCompleted*100)/n.noOfVoyagesPlanned;
    return ans;
  }
public static int findAvgVoyagesByPct(navalVessel[] nv, int perc){
  for(navalVessel n:nv){
    if(percentage(n)>=perc){
      avg+=n.noOfVoyagesCompleted;
      count+=1;
    }
  }
  if(avg==0){
    System.out.println("0");
  }
  else{
    System.out.println(avg/count);
    return 0;
  }
  return 1;
}

public static int findVesselByGrade(navalVessel nv[],String pur){
  for(navalVessel n:nv){
      if(percentage(n) == 100){
        n.classification = "Star";
      }
      else if(percentage(n) <100 && percentage(n) >=80){
        n.classification = "Leader";
      }
      else if(percentage(n) <80 && percentage(n) >=55){
        n.classification = "Inspirer";
      }
      else{
        n.classification = "Striver";
      }
  }
  for(navalVessel n:nv){
    if(n.purpose.equals(pur)){
      System.out.println(n.vesselName+"%"+n.classification);
      return 0;
    }
  }
  System.out.println("No Naval Vessel is available with the specified purpose");
  return 1;
}

public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  navalVessel[] nv = new navalVessel[4];
  for(int i = 0;i<4;i++){
    int id = sc.nextInt();
    sc.nextLine();
    String name = sc.nextLine();
    int planned = sc.nextInt();
    int completed = sc.nextInt();
    sc.nextLine();
    String purpose = sc.nextLine();
    nv[i] = new navalVessel(id,name,planned,completed,purpose);
  }
  int perc = sc.nextInt();
  sc.nextLine();
  String purpose = sc.nextLine();
  findAvgVoyagesByPct(nv,perc);
  findVesselByGrade(nv,purpose);
}
}

class navalVessel{
int vesselId;
String vesselName;
int noOfVoyagesPlanned;
int noOfVoyagesCompleted;
String purpose;
String classification;

public navalVessel(int id,String name,int planned,int completed,String pur){
  this.vesselId = id;
  this.vesselName = name;
  this.noOfVoyagesPlanned = planned;
  this.noOfVoyagesCompleted = completed;
  this.purpose = pur;
}
}
