package ferias;

import java.util.*;

public class chuteoNumero {	
	static int num=0;
	static int chute=0;
	static int tent=0;	
	
	
	static void gerarNum() {		
		
		Random random =new Random();
		
		num=random.nextInt(101);		
	}
	static void confChute() {
		
		Scanner leitor = new Scanner(System.in);		
		boolean validar=false;
			
		System.out.println("\n\nInsira o seu chute:");
		validar=leitor.hasNextInt();
			
		while (validar==true) {			
			chute=leitor.nextInt();
			
			if (chute==num) {
				tent++;
				System.out.println("Parabéns, você acertou!!\nO número era: "+num+".");
				System.out.println("Você precisou de "+tent+" tentativas para acertar.\n\n\n");
				jogarNovamente();
			}							
				
			else {
				tent++;
				System.out.println("Não foi dessa vez, tente novamente.");
				confChute();	}	
			}			
		
		if (validar==false) {	
			System.out.println("Entrada inválida");
			tent=0;
			confChute();						
		}		
	}
	static void jogarNovamente() {
		
		Scanner leitor = new Scanner (System.in);
		boolean validar=true;
		String resp="";
		
		System.out.println("Deseja jogar novamente?");
		validar=leitor.hasNextLine();
		
		while (validar==true) {
			resp=leitor.nextLine();
			
			if (resp.equalsIgnoreCase("S")|| resp.equalsIgnoreCase("Sim")) {
				gerarNum();
				tent=0;
				confChute();
			}
			else {
				System.out.println("\n\n\n\t\t\tJogo finalizado!\t\t\t");
				System.exit(chute);
			}}
			
		if (validar==false) {
			
			System.out.println("Entrada inválida, tente novamente.");
			jogarNovamente();			
		}
		
	}
	
	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		String resp=" ";
		boolean validar=true;
		
		
		System.out.println("\t\t\tJOGO DE ADIVINHAÇÃO\t\t\t");
		System.out.println("\n\nVamos gerar um valor de 0 a 100 e você terá que adivinhar qual valor é, está pronto?\nInsira S para sim e N para não:");
		validar=leitor.hasNextLine();
		
		while (validar=true) {
			resp=leitor.nextLine();
		
			if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("sim")) {		
				gerarNum();
				confChute();}		
		
			if (resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("nao")){
				System.out.println("\n\n\n\t\t\tJogo finalizado!\t\t\t");	}		
	}
	
		if (validar==false) 
			
			System.out.println("Entrada inválida, programa finalizado.");
		
}
}
