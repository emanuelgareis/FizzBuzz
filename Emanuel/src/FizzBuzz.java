
public class FizzBuzz {
static int i;
	public static void main(String[] args) {
		for( i = 1 ; i<=1000000; i++){
			if(divider3(i)){
				System.out.println(i+"  FIZZ");
				
				  if(divider5(i)){
					  System.out.println(i+"   Buzz");
					  
				                                 }
				  else{
					  if(divider5(i)){
						  System.out.println(i+"   Buzz");
						  
						  
					  }
					  else{
						  System.out.println(i);
						  
					  }
				  }
   }
  }
 }
	public static boolean divider3(int i){
		if(i%3==0){
			return true;
		}
		else{return false;}

			
		}
	public static boolean divider5(int i){
		if(i%5==0){
			return true;
		}
		else{
			return false;}
	}}


