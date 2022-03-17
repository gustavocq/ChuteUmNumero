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
				System.out.println("Parab�ns, voc� acertou!!\nO n�mero era: "+num+".");
				System.out.println("Voc� precisou de "+tent+" tentativas para acertar.\n\n\n");
				jogarNovamente();
			}							
				
			else {
				tent++;
				System.out.println("N�o foi dessa vez, tente novamente.");
				confChute();	}	
			}			
		
		if (validar==false) {	
			System.out.println("Entrada inv�lida");
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
			
			System.out.println("Entrada inv�lida, tente novamente.");
			jogarNovamente();			
		}
		
	}
	
	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		String resp=" ";
		boolean validar=true;
		
		
		System.out.println("\t\t\tJOGO DE ADIVINHA��O\t\t\t");
		System.out.println("\n\nVamos gerar um valor de 0 a 100 e voc� ter� que adivinhar qual valor �, est� pronto?\nInsira S para sim e N para n�o:");
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
			
			System.out.println("Entrada inv�lida, programa finalizado.");
		
}
}
