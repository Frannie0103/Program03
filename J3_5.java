import java.util.Scanner;


public class J3_5 {
 public static void main(String[] args) {
  String initStr="東京特許許可局許可局長";
  Scanner sc=new Scanner(System.in);
  String find=sc.nextLine();
  System.out.println(initStr);
  System.out.println(repeatNum(initStr, find)+"個");
 }
 
 public static int repeatNum(String initStr,String find){
  int count=0;
  for(int i=0;i<initStr.length()-find.length();i++){
      String temp=initStr.substring(i, i+find.length());
   if(temp.equals(find)){
    count++;
   }
  }
  return count;
 }
}