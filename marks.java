package csa0981;
import java.util.*;
public class grade {
	public static void main(String[] args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("enter the how many subjects");
		int n = aa.nextInt();
		System.out.println("enter the maths marks");
		int m=aa.nextInt();
		System.out.println("enter the physics marks");
		int p=aa.nextInt();
		System.out.println("enter the chemistry marks");
		int c=aa.nextInt();
		System.out.println("enter the english marks");
		int e = aa.nextInt();
		int TotalMarks=m+p+c+e;
		int AveragePercentage=TotalMarks/n;
		if(AveragePercentage>90)
		{
			System.out.println("A grade");
		}
		else if(AveragePercentage>80 & AveragePercentage<=90)
		{
			System.out.println("B grade");
		}
		else if(AveragePercentage>70 & AveragePercentage<=80)
		{
			System.out.println("C grade");
		}
		else if(AveragePercentage>60 & AveragePercentage<=70)
		{
			System.out.println("D grade");
		}
		else if(AveragePercentage>50 & AveragePercentage<=60)
		{
			System.out.println("E grade");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}
	

}