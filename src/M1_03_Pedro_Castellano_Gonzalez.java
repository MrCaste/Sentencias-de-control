import java.util.Scanner;

public class M1_03_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int notaMat , notaFisica, notaQuimica, notaLengua, notaHistoria, Resultado=0;
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce la nota de Matematicas: ");
		notaMat=teclado.nextInt();
		System.out.println("Introduce la nota de Fisica: ");
		notaFisica=teclado.nextInt();
		System.out.println("Introduce la nota de Quimica: ");
		notaQuimica=teclado.nextInt();
		System.out.println("Introduce la nota de Lengua: ");
		notaLengua=teclado.nextInt();
		System.out.println("Introduce la nota de Historia: ");
		notaHistoria=teclado.nextInt();
		
		teclado.close();
		
		Resultado=(notaMat+notaFisica+notaQuimica+notaLengua+notaHistoria)/5;
		
		System.out.println("La media es: "+Resultado);
		
		
		switch (Resultado) {
		case 0,1,2:
			
			System.out.println("Muy deficiente");
			
			break;
			
		case 3,4:
			
			System.out.println("Deficiente");
		
			break;
			
		case 5:
			
			System.out.println("Suficiente");
		
			break;
			
		case 6:
			
			System.out.println("Bien");
			
			break;
			
		case 7,8:
			
			System.out.println("Notable");
		
			break;
			
		case 9,10:
			
			System.out.println("Sobresaliente");
		
			break;

		default:
			
			System.err.println("Hay algun error al introducir una nota");
			break;
		}
		
		
		
		
		

	}

}
