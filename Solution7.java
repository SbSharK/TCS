//11-MARCH CPA

import java.util.*;
import java.util.Arrays;
import java.lang.*;

public class Solution7
{
    static int count = -1;
    static double[] maxprice = new double[5];
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Package p[] = new Package[5];
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            sc.nextLine();
            String fCity = sc.nextLine();
            String dCity = sc.nextLine();
            String oDate = sc.nextLine();
            String dDate = sc.nextLine();
            double pr = sc.nextDouble();
            p[i] = new Package(num,fCity,dCity,oDate,dDate,pr);
        }
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int res = countOrders(p,s1);
        if(res>0){
            System.out.println(res);
        }
        else{
            System.out.println("null");
        }
        Package temp = searchPackage(p,s2);
        if(temp == null){
            System.out.println("null");
        }
        else{
            System.out.println(temp.invoiceNumber+"\n"+temp.price);
        }
     }

     static int countOrders(Package pack[],String s){
         for(Package p:pack){
             if(p.fromCity.equalsIgnoreCase(s)){
                 int odate = Character.getNumericValue(p.orderDate.charAt(0)+p.orderDate.charAt(1));
                 int ddate = Character.getNumericValue(p.deliveryDate.charAt(0)+p.deliveryDate.charAt(1));
                 if(ddate-odate<=8){
                     count++;
                 }
             }
         }
         if(count!=0){
             return count;
         }
         return 0;
     }

     static Package searchPackage(Package pack[],String s){
         for(Package p : pack){
             if(p.toCity.equalsIgnoreCase(s)){
                 for(int i=1;i<5;i++){
                     if(maxprice[0]==0){
                         maxprice[0] = p.price;
                     }
                     else{
                         if(maxprice[i-1]<p.price){
                             maxprice[i] = p.price;
                         }
                     }
                 }
             }
         }
         Arrays.sort(maxprice);
         for(Package p:pack){
          if(maxprice[2] == p.price){
              return p;
          }
         }
         return null;
     }
}

     class Package{
      int invoiceNumber;
      String fromCity;
      String toCity;
      String orderDate;
      String deliveryDate;
      double price;

      public Package(int a,String b,String c,String d,String e,double p){
          this.invoiceNumber = a;
          this.fromCity = b;
          this.toCity = c;
          this.orderDate = d;
          this.deliveryDate = e;
          this.price = p;
      }
     }
/* SAMPLE IP

1
DEL
mum
12-06-2020
21-06-2020
700
2
Mum
del
04-09-2020
17-09-2020
300
3
HYD
mum
06-12-2020
10-12-2020
1000
4
AHD
DDN
24-08-2020
30-08-2020
1200
5
mum
DEL
14-11-2020
24-11-2020
700
del
LKO

OP :
null
null

SECOND IP :

101
Ahd
Mum
12-03-2020
17-03-2020
1500
123
Mum
del
14-09-2020
17-09-2020
300
453
HYD
Mum
16-06-2020
22-06-2020
1000
169
ddn
MUM
24-07-2020
31-07-2020
1200
276
mum
DEL
04-11-2020
14-11-2020
700
mum
mum

OP:
1
169
1200.0
*/
