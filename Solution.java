import java.util.*;
import java.lang.*;

class Solution{
  static int max = 0;
  public static int findAgencyWithHighestPackagePrice(TravelAgencies[] t){
    for(TravelAgencies tA:t){
      if(max == 0){
        max = tA.getPrice();
      }
      else if(max < tA.getPrice()){
        max = tA.getPrice();
      }
      else{
        continue;
      }
    }
    return max;
  }

  public static void agencyDetailsForGivenldAndType(TravelAgencies[] t,int regNo,String packageType){
    for(TravelAgencies tA:t){
      if(tA.regNo == regNo && tA.packageType.equals(packageType)){
        System.out.println(tA.getAgencyName()+":"+tA.price);
      }
    }
  }

public static void main(String[] args){
  int count = 4;
  Scanner sc = new Scanner(System.in);
  TravelAgencies[] t = new TravelAgencies[count];
  for(int i = 0;i<count;i++){
    int reg = sc.nextInt();
    sc.nextLine();
    String agn = sc.nextLine();
    String pt = sc.nextLine();
    int pri = sc.nextInt();
    boolean ff = sc.nextBoolean();
    t[i] = new TravelAgencies(reg,agn,pt,pri,ff);
  }
  int reg = sc.nextInt();
  String packtype = sc.next();
  System.out.println(findAgencyWithHighestPackagePrice(t));
  agencyDetailsForGivenldAndType(t,reg,packtype);
}
}

class TravelAgencies{
int regNo;
String agencyName;
String packageType;
int price;
boolean flightFacility;

public TravelAgencies(int r,String name,String pt,int pr,boolean ff){
  this.regNo = r;
  this.agencyName = name;
  this.packageType = pt;
  this.price = pr;
  this.flightFacility = ff;
}

public int getRegNo(){
return this.regNo;
}

public void setRegNo(int regNo){
this.regNo = regNo;
}

public String getAgencyName(){
return agencyName;
}

public void setAgencyName(String agencyName){
this.agencyName = agencyName;
}

public String getPackageType(){
return packageType;
}

public void setPackageType(String packageType){
this.packageType = packageType;
}

public int getPrice(){
return this.price;
}

public void setPrice(int price){
this.price = price;
}

public boolean getFlightFacility(){
return this.flightFacility;
}

public void setFlightFacility(boolean flightFacility){
this.flightFacility = flightFacility;
}

}
