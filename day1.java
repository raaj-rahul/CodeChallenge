package day1Code;
import java.util.*;
//Check Odd or even
public class day1 {
	public static boolean isEven(int n) {
		int rem = n%2;
		if(rem==0) {
			return true;
		}else {
			return false;
		}
	}
	//table 
	public static void Table(int m) {
		for(int i=1;i<=10;i++) {
			System.out.println(m+"*"+ i+ "=" + m*i);
		}
	}
	//dice face
	public static void DiceOpp(int f) {
		int face=7-f;
		System.out.println("The opposite face of "+f+" is " +face);
	}

	//sum of n natural numbers
	public static void SumofNum(int a) {
		int sum=0;
		for(int i=0;i<=a;i++) {
			sum=sum+i;
						
		}System.out.println("The sum of Natural numbers is:"+sum);
	}
	//Sum of square of natural numbers
	public static void sumOfSq(int b) {
		int sum=0;
		for(int i=0;i<=b;i++) {
			sum= sum+(i*i);
			
		}System.out.println("The sum of squares of natural number: " + sum);
	}

	//swap value
	public static void swapValue(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("The swap values are:"+"x=" +x +" and " +"y=" +y);
	}
	
	public static void nThTermAP(int a1,int a2,int p) {
		int an=a1+(a2-a1)*(p-1);
		System.out.println("The " +p+ " term of AP is : "+an);
	}
	public static void SumOfDigit(int num) {
		int sum =0;
		while(num!=0) {
			int last= num%10 ;
			sum +=last;
			num=num/10;
		}System.out.println("Sum of the digits of the given number is "+sum);
	}
	public static void reverse(int num1) {
		int rev=0;
		while(num1>0) {
			rev=rev*10 + num1%10;
			num1=num1/10;
		}
		System.out.println("The reverse of the given number is "+rev);
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the face of the dice: ");
	int f=sc.nextInt();
	DiceOpp(f);
	System.out.print("Enter the number(n):");
	int n =sc.nextInt();
	if(isEven(n)==true) {
		System.out.println("The given number is Even.");
	}else {
		System.out.println("The given number is Odd.");
	}
	System.out.print("Enter the Table number(m):");
	int m=sc.nextInt();
	Table(m);
	System.out.print("Enter the number(a):");
	int a =sc.nextInt();
	SumofNum(a);
	System.out.println("Enter the value of b:");
	int b=sc.nextInt();
	sumOfSq(b);
	System.out.println("Enter the value of x:");
	int x=sc.nextInt();
	System.out.println("Enter the value of y:");
	int y=sc.nextInt();
	swapValue(x,y);
	System.out.println("Enter the value of a1:");
	int a1=sc.nextInt();
	System.out.println("Enter the value of a2:");
	int a2=sc.nextInt();
	System.out.println("Enter the value of nth term:");
	int p=sc.nextInt();
	nThTermAP(a1,a2,p);
	System.out.println("Enter the number:");
	int num =sc.nextInt();
	SumOfDigit(num);
	System.out.println("Enter the number to reverse");
	int num1=sc.nextInt();
	reverse(num1);
}
}
