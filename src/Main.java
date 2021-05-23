import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, menor,maior;
		int [] vet=new int[10];
		
		for(i=0;i<10;i++) {
			System.out.println("Digite um numero");
		vet[i]=sc.nextInt();
		
		
		}
		System.out.println("Vetor informado");
			for(i=0;i<vet.length;i++)
			System.out.printf("vet[%d] = %2d\n",i,vet[i]);
			
			menor=vet[0];
			for( i=1;i<vet.length;i++)
				if(vet[i]< menor)
					menor=vet[i];
			System.out.println("menor valor "+menor);
			
			maior=vet[0];
			for( i=1;i<vet.length;i++)
				if(vet[i]> maior)
					maior=vet[i];
			System.out.println("maior valor "+maior);
		

	}

}
