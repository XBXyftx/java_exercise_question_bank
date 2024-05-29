package p5;

import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args)throws Exception{
		try{
			Scanner sc = new Scanner(System.in);
			Triangle t = new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
			System.out.println("周长是"+t.getLong());
			System.out.println("面积是"+t.getArea());
		}catch(IllegalTriangleException e){
			System.out.println(e.getMessage());
			System.out.println(e.getA());
			System.out.println(e.getB());
			System.out.println(e.getC());
		}
		
	}
}


class Triangle{
	double a,b,c;
	public Triangle(double a,double b,double c)throws Exception{
		if(CanTriangle(a,b,c)){
			this.a=a;
			this.b=b;
			this.c=c;
		}else{
			throw new IllegalTriangleException("三条边为"+a+","+b+","+c+",不满足任意两条边的和大于第三条边的规则",a,b,c);
		}
		
	}
	
	public static boolean CanTriangle(double a,double b,double c){
		if(a+b<=c||a+c<=b||b+c<=a){
			return false;
		}else{
			return true;
		}
	}
	
	public double getArea(){
		double p = (a+b+c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	
	public double getLong(){
		return a+b+c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	
	
}

class IllegalTriangleException extends Exception{
	double a,b,c;

	public IllegalTriangleException(String msg,double a,double b,double c){
		super(msg);
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
}