public class Uebung {

	public static void main(String[] args) {
		int zahl;
		
		
		
		for(int i = 5; i <=100 ;i++){
			zahl=i;
			System.out.print("DESISCHDIEZAHLEN:"+zahl+"| ");
		
		while(zahl>1){
			
		if(zahl%2!=0) {      // wenn rest von zahl(durch zwei) nicht null ist ist sie ungerade 
		zahl=zahl*3+1;	
		}
		else{zahl=zahl/2;}
		
		
	System.out.print(zahl + ",");
	}
		System.out.println("");
}
}
	}
	
	
