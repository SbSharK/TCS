/* John and Linda are playing a game. john asked linda to find a no. whose square ends with a no. itself.
The no. should also be a positive no. write a program to implement the same logic
*/

import java.util.*;

class sqaureNumbers{
  public static void main(String args[]){
    String num;
    int sqrt;
    int rem;
    Scanner sc = new Scanner(System.in);
    num = sc.next();
    int no = Integer.parseInt(num);
    sqrt = no*no;
    while(sqrt>0){
      sqrt = sqrt%10;
      if(sqrt == no){
        System.out.println("TRUE");
        break;
      }
      else{
        if(sqrt == 0){
          System.out.println("FALSE");
          break;
        }
        continue;
      }
    }
  }
}
