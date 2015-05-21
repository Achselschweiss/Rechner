package thomas;

import java.util.Scanner;

public class trechner {
	
	public static void main(String[] args) {
		
		 Scanner s  = new Scanner(System.in);
		
		String Name;
		
		System.out.println ("Wie ist Ihr Vorname?");
	    Name = s.next();
		System.out.println ("Hallo " + Name + ", das ist mein Taschenrechner!");
		
		boolean keepRunning = true;
		
	//	double [] speicher = new double [3];
	//	int sp = 0;
		
		while( keepRunning ){
		
		System.out.println("Die erste Zahl, bitte.");
		double x = s.nextDouble();
		
		System.out.println("Den Operator, bitte.");
		String z = s.next();
		
		System.out.println("Die zweite Zahl, bitte.");
		double y = s.nextDouble();
		
		
		double result = 0;
		
		
		switch(z){
		
		case "+":
			 result = x + y;
			 
		System.out.println(result);
		
			break;
		
		case "-":
			 result = x - y;
			 
			break;
		
		case "*":
			 result = x * y;
			
			break;
		
		case "/":
			 result = x / y;
			 
			 break;
			 
		default: System.out.println("Dieser Operator ist mir nicht bekannt!");
			
		}
		
		String ausgabe = "Rechnung: " + x + " " + z + " " + y + " = " + result;
		
		System.out.println(ausgabe);	 
		
		System.out.println("Sind Sie fertig? (Ja/Nein)");
		
			if(s.next().equals("Ja")){
				keepRunning = false;
		}
			
			/*
			speicher[sp] = result;
			for(double d : sp){
				System.out.println("" + d);
			*/
			
			}
	
			System.out.println("Auf Wiedersehen!");
			
		}
		
		/*
		if (z.equals("+")) {
			double as = x + y;
			System.out.println(as);
			System.out.println("Das Ergebnis der Addition ist: "+as);
		}
			
		else if (z.equals("-")) {
			double as = x - y;
			System.out.println(as);
			System.out.println("Das Ergebnis der Subtraktion ist: "+as);
	    }
		
		else if (z.equals("*")) {
			double as = x * y;
			System.out.println(as);
			System.out.println("Das Ergebnis der Multiplikation ist: "+as);
		}
		
		else if (z.equals("/")) {
			double as = x / y;
			System.out.println("Das Ergebnis der Division ist: "+as);
		}
		
		
		
		
		
		
		
	

		double x, y, z;
		x = s.nextDouble();
		y = s.nextDouble();
		
		z = x + y;
		
		System.out.println("Addition: " + z);
		
		z = x - y;
		System.out.println("Subtraktion " + z);
		
		z = x * y;
		System.out.println("Multiplikation " + z);
		
		z = x / y;
		System.out.println("Division " + z);
		
		*/
		
		
	}
	

