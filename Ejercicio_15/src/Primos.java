import java.util.*;


public class Primos {

	public static void main(String [] args){
		Scanner in=new Scanner (System.in);
		
		
		System.out.println("Ingrese el número: ");
		int x=in.nextInt();
		
		double raiz=Math.sqrt(x);
		System.out.println(raiz);
		
		int res=x%2;
		System.out.println(res);
			
		for (int i=2; i<raiz;i++){
			
			System.out.println(i++);
		}
		
		
		
	}
	
}

