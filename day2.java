package day1Code;
import java.util.*;
public class day2 {
	static void PrimeNumber(int num) {
		int count=0;
		for(int i=1;i<num;i++) {
			int fac=num%i;
			if(fac==0) {
				count=count+1;
			}
		}
		if(count==2) {
			System.out.println("Number is Prime");
		}else if(num<=1){
			System.out.println("Number is Invalid");
		}else {
			System.out.println("Number is Composite");
		}
	}
	static void PowerCheck(int x, int y) {
		int power=1;
		for(int i=0;power<=y;i++) {
			if(power==y) {
				System.out.println("Number is power");
				return;
			}
			power *=x;
		}
			System.out.println("Number is not power");
			}
	static void distance(long a1, long b1, long a2, long b2) {
		System.out.println(Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2)));
	}
	static void Triangle(long a, long b, long c) {
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("Triangle possible");
		}else {
			System.out.println("Not possible");
		}
	}
	static void Fact(int f) {
		int Factorial=1;
		for(int i=1;i<=f;i++) {
			Factorial = Factorial*i;
		}System.out.println("Factorial of "+f+ "="+Factorial);
	}
	static void CubeCount(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i*i*i + j*j*j==n) {
				count++;
			}
		  }
		}
		System.out.println("The no. cube count is "+count);
	}
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number:");
	int num= sc.nextInt();
	PrimeNumber(num);
	System.out.println("Enter the base number:");
	int x= sc.nextInt();
	System.out.println("Enter the number to check");
	int y= sc.nextInt();
	PowerCheck(x,y);
	System.out.println("Enter the co-ordinates a1:");
	long a1=sc.nextLong();
	System.out.println("Enter the co-ordinates a2:");
	long a2=sc.nextLong();
	System.out.println("Enter the co-ordinates b1:");
	long b1=sc.nextLong();
	System.out.println("Enter the co-ordinateside b2:");
	long b2=sc.nextLong();
	distance(a1,a2,b1,b2);
	System.out.println("Enter the side a:");
	long a=sc.nextLong();
	System.out.println("Enter the side b:");
	long b=sc.nextLong();
	System.out.println("Enter the side c:");
	long c=sc.nextLong();
	Triangle(a,b,c);
	System.out.println("Enter the number f:");
	int f=sc.nextInt();
	Fact(f);
	System.out.println("Enter the number to check cube count:");
	int n=sc.nextInt();
	CubeCount(n);
}
}
