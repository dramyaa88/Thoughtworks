package Pair_Programming;
import java.util.*;
public class project {
	int km;
	int b = 0;
	int c = 0;
	int d = 0;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		km = sc.nextInt();
	}
	void Minicalculate()
	{
		if(km <= 3)
			System.out.println("Mini"+"-"+"Rs. 50,");
		else if(km>3 && km<=18)
		{
			b = 10;
			c = 50+((km-3)*b);
			System.out.println("Mini"+" - "+"Rs. "+c+",");
		}
		else if(km>18 && km<=75)
		{
			b = 8;
			c = km-18;
			d = 50+((km-3-c)*10)+(c*b);
			System.out.println("Mini"+" - "+"Rs. "+d+",");
		}
		else
		{
			b = 8;
			d = km*8;
			System.out.println("Mini"+" - "+"Rs. "+d+",");
		}
		
			
	}
	void sedan()
	{
		if(km<=5)
		{
			System.out.println("Sedan"+" - "+"Rs. 80,");
		}
		else if(km>5 && km<=20)
		{
			b = 12;
			c = 80+((km-5)*b);
			System.out.println("Sedan"+" - "+"Rs. "+c+",");
		}
		else if(km>20 && km<=100)
		{
			b = 10;
			d = km - 20;
			c = 50+((km-5-d)*12)+(d*b);
			System.out.println("Sedan"+" - "+"Rs. "+c+",");
		}
		else if(km>100)
		{
			b = 10;
			d = km*b;
			System.out.println("Sedan"+" - "+"Rs. "+d+",");
		}
		
	}
	void SUV()
	{
		if(km<=5)
		{
			System.out.println("SUV"+" - "+"Rs. 100");
		}
		else if(km>5 && km<=20)
		{
			b= 15;
			c = 100+((km-5)*b);
			System.out.println("SUV"+" - "+"Rs. "+c);
		}
		else
		{
			b = 12;
			d = km*b;
			System.out.println("SUV"+" - "+"Rs. "+d);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		project obj  = new project();
		obj.input();
		obj.Minicalculate();
		obj.sedan();
		obj.SUV();
		
	}

}
