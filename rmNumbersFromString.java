import java.util.*;
import java.lang.*;
//to remove 53 and 8 from the string
class rmNumbersFromString{
    	public static void main(String args[])
	{
    Scanner sc = new Scanner(System.in);
		String sentence = new String();
		sentence = sc.nextLine();
    char arr[] = new char[sentence.length()];
    arr = sentence.toCharArray();
		for(int i = 0;i<sentence.length();i++){
      if(arr[i] == '5' && arr[i+1] == '3'){
        arr[i] = '$';
        arr[i+1] = '$';
      }
      else if(arr[i] == '8'){
        arr[i] = '$';
      }
      else{
        continue;
      }
    }
    for(int i = 0;i<sentence.length();i++){
      if(arr[i] != '$' ){
      System.out.print(arr[i]);
    }
    else{
      continue;
    }
    }
}
}
