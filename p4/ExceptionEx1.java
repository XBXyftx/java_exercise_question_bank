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
    	   System.out.println("���������쳣");
       }catch(NumberFormatException e){
    	   System.out.println("���ݸ�ʽ�쳣");
       }catch(ArrayIndexOutOfBoundsException e){
    	   System.out.println("���������±곬Խ���쳣");
       }
       

       

       System.out.println("����������������");

  }

}