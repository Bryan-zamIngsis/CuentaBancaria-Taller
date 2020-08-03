import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		CuentaCorriente ctaC = new CuentaCorriente();
		CuentaAhorro ctaAho= new CuentaAhorro();
		
		
		System.out.println("Nombre del titular de la cuenta: ");
		Scanner nom = new Scanner(System.in);
		String nombre = nom.nextLine();
		
		
		boolean salir=false;
		while (!salir) {
			System.out.println("\nMenu Principal");
			System.out.println("----------------------");
			System.out.println("1. Deposito de cuenta Corriente");
			System.out.println("2. Deposito de cuenta de Ahorro");
			System.out.println("3. Retiro de cuenta Corriente");
			System.out.println("4. Retiro de cuenta de Ahorro");
			System.out.println("5. Consultar su Saldo");
			System.out.println("Digite Opcion: ");
			Scanner entrada = new Scanner(System.in);
			int opcion = entrada.nextInt();
			
			Scanner in = new Scanner(System.in);
		
			switch (opcion) {
			case 1:
				
				System.out.println("Cantidad de deposito de cuenta Corriente: ");
				double dinero = in.nextDouble();
				ctaC.deposito(dinero);
				break;
			
			case 2:
				
				System.out.println("Cantidad de deposito de cuenta de Ahorro: ");
				dinero = in.nextDouble();
				ctaAho.deposito(dinero);
				break;
			
			case 3: 
				System.out.println("Cantidad de retiro de cuenta Corriente: ");
				dinero = in.nextDouble();
				ctaC.retiro(dinero);
				break;
				
			
			case 4:
				System.out.println("Cantidad de retiro de cuenta de Ahorro: ");
				dinero = in.nextDouble();
				ctaAho.retiro(dinero);
				break;
				
			
			case 5:
				System.out.println("Saldo de cuenta Corrinete: "+ ctaC.getSaldo());
				System.out.println("Saldo de cuenta de Ahorro: "+ ctaAho.getSaldo());
				break;
				
			default:
				System.out.println("Las opciones son entre 1 y 5");
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
