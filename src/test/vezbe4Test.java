package test;
import java.util.Objects;

import geometry.*;

public class vezbe4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point point=new Point(10,10,false);
		Line line= new Line(new Point(30,30), new Point(40,40), false);
		
		System.out.println(line);
		System.out.println(line.toString());
		System.out.println(point);
		
		if(point instanceof Point)
		{
			System.out.println("promenljiva point je instanca tipa point");
		}
		if(point instanceof Objects)
		{
			System.out.println("promenljiva point je instanca tipa point");
		}
		
		Point point1= new Point(50,50);
		Point point2= new Point(50,50);
		Point point3=point1;
		
		if(point1==point2)
		{
			System.out.println("referenca point1 i point2 ukazujw na isti objekat");
		}
		else
		{
			System.out.println("referenca point1 i point2 ne ukazujw na isti objekat");
		}
		
		/*point1.setX(10);
		System.out.println(point3.getX());/)*/
		
		System.out.println(point1.equals(point2));
		
		
		if(point1.equals(point2))
		{
			System.out.println("tacka point1 i point2 su iste");
		}
		else 
		{
			System.out.println("tacke point1 i point2 nisu iste");
		}
		
		
		
	}

}
