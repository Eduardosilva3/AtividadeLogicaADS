package bancodedados;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = " ";
		String cpf = "";
		int id = 0;
		int navegacao = 0;
		String nav = "s";
		
		MysqlConnection sql = new MysqlConnection();
		
		while (nav.equalsIgnoreCase("s")){
			System.out.println("1 - cadastrar. 2 - Consultar");
			navegacao = scan.nextInt();
			
			
			switch (navegacao) {
			case 1:
				System.out.println("nome");
				nome = scan.next();
				System.out.println("cpf");
				cpf = scan.next();
				
				sql.BD(id, nome, cpf, navegacao);
				break;
			case 2: 
				System.out.println("id");
				id = scan.nextInt();
				
				System.out.println("Buscando dados ...");
				sql.BD(id, nome, cpf, navegacao);

			default:
				break;
			}
			
			
				
			System.out.println("/n Continuar");
			nav = scan.next();
			
		}

	}

}
