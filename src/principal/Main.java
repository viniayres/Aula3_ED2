package principal;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Hash h= new Hash(13);
		boolean exit = false;
		Scanner scan = new Scanner(System.in);
		int opc, chave;
		
		do{
			System.out.println("O que fazer?\n"
					+ "1)Adicionar chave\n"
					+ "2)Sair");
			
			opc = scan.nextInt();
			
			switch(opc){
				case 1:
					System.out.println("Digite a chave");
					chave = scan.nextInt();
					h.addMod(chave);
					System.out.println("Chave adicionada");
					break;
				case 2:
					exit = true;
					break;
			
			}
			
			
			
			
		}while(!exit);
	
		scan.close();
	
	}

}
