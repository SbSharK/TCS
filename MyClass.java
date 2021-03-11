import java.util.*;
public class MyClass{
static double sum=0;
static double count=0;
  public static void main(String args[]){

  }
  static double findAveragePriceForGivenType(Hotel hotel[],String s){
    for(Hotel h:hotel){
      if(h.roomType.equalsIgnoreCase(s)){
        if(h.wifiFacility == true){
          sum+=h.price;
          count++;
        }
      }
    }
    if(sum!=0){
      return Double.parseDouble(sum/count);
    }
    return 0.0;
  }
}

class Hotel{
  int regNo;
  String hotelName;
  String roomType;
  int price;
  boolean wifiFacility;

  public Hotel(int a,String b,String c,int d,boolean e){
    this.regNo = a;
    this.hotelName = b;
    this.roomType = c;
    this.price = d;
    this.wifiFacility = e;
  }
}
