package com.ty.jsp;
class Cal{
       
    public void add(int a, int b)
     {
	  int sum=a+b;
	  System.out.println("Add:" + sum);
     }
    public void sub(int a, int b)
     {
	  int sub=a-b;
	  System.out.println("Sub:" +sub);
     }
    public void mul(int a, int b)
    {
	  int mul=a*b;
	  System.out.println("Mul:" +mul);
    }
    public void div(int a, int b)
     {
	 int div=a/b;
	 System.out.println("Div:" +div);
     }
    public class Calculated {
	
	public static void main(String[] args) {
	Cal c = new Cal();
    c.add(10,20);
    c.sub(52, 10);
    c.mul(12, 5);
    c.div(10,2);
	
	}
}
}
