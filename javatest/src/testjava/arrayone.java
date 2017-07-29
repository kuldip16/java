package testjava;



public class arrayone {
	
	
	

public static void main(String[] args) {
		String [] Ani= {"tigar","Lion", "Leapord"};
		System.out.println(Ani.length);
		 print_Ani(Ani);
		

	}
	public static void print_Ani(String[] sarray){
		
		for(int i=0;i<3;i++){
			System.out.println(sarray[i]);
			
		}
	}

}
