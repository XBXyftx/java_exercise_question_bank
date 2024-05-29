package p4;

import java.util.Scanner;

public class ExceptionEx1 {

  public static void main(String[] args) {

       
       try{
    	   Scanner input=new Scanner(System.in); 

       String[] arr=new String[2];
    	   int n=input.nextInt();

       for(int i=0;i<n;i++)

           arr[i]=input.next(); 

       int a=Integer.parseInt(arr[0]);

       int b=Integer.parseInt(arr[1]);
       
       System.out.println(a/b);
       }catch(ArithmeticException e){
    	   System.out.println("捕获算术异常");
       }catch(NumberFormatException e){
    	   System.out.println("数据格式异常");
       }catch(ArrayIndexOutOfBoundsException e){
    	   System.out.println("捕获数组下标超越界异常");
       }
       

       

       System.out.println("继续运行其他代码");

  }

}