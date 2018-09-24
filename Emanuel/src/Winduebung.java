import java.util.Scanner;

public class Winduebung {
	static Scanner s = new Scanner (System.in);
	
 
	public static void main(String[] args) {
		
		System.out.println("Hier:");
		int kmh = s.nextInt();
	
		if (kmh<2){
			System.out.println("Windstill");
			
		}
		if (kmh>100){
			System.out.println("OOORRRRRRRRKKKKKKKKKAAAAAAAAAAAANNNNNNNNNNN");
			
		}
		
		System.out.println(Math.round(Math.pow((kmh/3.6)/0.836,0.667)));
		

	}

}
