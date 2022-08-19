import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ClassePrincipal {
	private static List<String> nomes;
	private static List<String> situacao;
	private static List<Double> notas;
	private static int idAluno;
	private static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		/*int quantidadeAlunos = 0;
		String nomeAluno = "";
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		int idAluno = 0;*/
		int menuEscolha = 0;
		
		
		
		
		System.out.println("Inicializando Sistema - Criando Coleções \n");
		
		criarArrayNomes();
		criarArrayNotasMedia();
		criarArraySituacao();
		
		System.out.println("===== Seja Bem Vindo ao sistema de cadastramento de notas. ====");
		System.out.println("");
		
		do {
			System.out.println("Selecione a Opção desejada: ");
			System.out.println("1 - Cadastrar Aluno.");
			System.out.println("2 - Exibir lista de Aluno.");
			System.out.println("3 - Exibir Lista de premiação. ");
			System.out.println("4 - Exibir Quantitativo de aluno por situação. ");
			System.out.println("Para sair Digite a senha: 9999.");
			menuEscolha = lerDadoInt();
			
			if(menuEscolha != 9999) {
				menuNavegacao(menuEscolha);
				System.out.println("");
			}
			
		}while(menuEscolha != 9999);
		
		System.out.println("Finalizando Sistema ...");
		System.out.println("Sistema Finalizado com Sucesso!");
		
		/*System.out.println("Digite a Quantidade Inicial de alunos que deseja Cadastrar: ");
		
		quantidadeAlunos =  scan.nextInt();
		
		for(int i = 1; i <= quantidadeAlunos; i++) {
			System.out.println("Nome do aluno: ");
			nomeAluno = scan.next();
			System.out.println("Digite a nota 1 de "+nomeAluno+":");
			nota1 = scan.nextDouble();
			System.out.println("Digite a nota 2 de "+nomeAluno+":");
			nota2 = scan.nextDouble();
			System.out.println("Digite a nota 3 de "+nomeAluno+":");
			nota3 = scan.nextDouble();
			
			adicionarAluno(idAluno, nomeAluno, nota1, nota2, nota3);
			
			idAluno++;
		}
		
		imprimirAlunoSituacao();
		
		imprimirQuantidadeSitucao();
		
		exibirPremiacao(); */
		
		
		
		 
		
		
		

	}
	
	
	public static void menuNavegacao(int escolha) {
		int quantidadeAlunos = 0;
		
		String nomeAluno = "";
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		switch (escolha) {
		case 1:
			System.out.println("Digite a Quantidade de aluno que deseja cadastrar: ");
			
			quantidadeAlunos = lerDadoInt();
			
			for(int i = 1; i <= quantidadeAlunos; i++) {
				System.out.println("Digite o Nome do aluno: ");
				nomeAluno = lerDado();
				System.out.println("Digite a nota 1 de "+nomeAluno+":");
				nota1 = lerDadoDouble();
				System.out.println("Digite a nota 2 de "+nomeAluno+":");
				nota2 = lerDadoDouble();
				System.out.println("Digite a nota 3 de "+nomeAluno+":");
				nota3 = lerDadoDouble();
				
				adicionarAluno(idAluno, nomeAluno, nota1, nota2, nota3);
				
				System.out.println("Aluno Adicionado com Sucesso!");
				
				idAluno++;
				System.out.println("");
			}
			break;
		case 2:
			System.out.println("=== Imprimindo Lista de Alunos. ===");
			imprimirAlunoSituacao();
			break;
		case 3:
			System.out.println("=== Imprimindo Premiação dos Alunos. ===");
			exibirPremiacao();
			break;
		
		case 4:
			System.out.println("=== Imprimindo Quantitativos de Aluno por situação. ===");
			imprimirQuantidadeSitucao();
			break;
		
		
		
		
		default:
			System.out.println("Opção Invalida - Tente novamente.");
			break;
		}
	}
	
	
	public static void  criarArrayNomes() {
				
		nomes =  new ArrayList<>();
				
		
	}
	
	public static void criarArraySituacao() {
		
		situacao = new ArrayList<>();
				
		
	}
	
	public static void criarArrayNotasMedia() {
		
		notas = new ArrayList<>();
				
		
	}
	
	public static String obterSituacaoAluno(double nota1, double nota2, double nota3) {
		String situacao = "";
		double media = (nota1 + nota2 + nota3) / 3;
		
		if(media>=6) {
			situacao = "APROVADO";
		}else if(media>=3){
			situacao = "EXAME FINAL";
		}else if(media<3 && media >=0) {
			situacao = "REPROVADO";
		}
		
		
		return situacao;


			
			
			
	}
	
	public static void adicionarAluno(int idAluno, String nome, double nota1, double nota2, double nota3) {
		nomes.add(idAluno, nome);
		double media = (nota1 + nota2 + nota3) / 3;
		notas.add(idAluno, media);
		situacao.add(idAluno, obterSituacaoAluno(nota1, nota2, nota3));
		
	}
	
	public static void imprimirAlunoSituacao() {
		for(int i = 0; i <=nomes.size()-1;i++) {
			System.out.println("Nome: "+nomes.get(i)+": "+situacao.get(i));
		}
	}
	public static void imprimirQuantidadeSitucao() {
		int aprovado = 0;
		int reprovado = 0;
		int exameFinal = 0;
		Iterator<String> notaIterator = situacao.iterator();
		while(notaIterator.hasNext()) {
			String situacao = notaIterator.next();
			if(situacao.equals("APROVADO")) {
				aprovado++;
			}else if(situacao.equals("REPROVADO")){
				reprovado++;
			}else if(situacao.equals("EXAME FINAL")) {
				exameFinal++;
			}
		}
		
		System.out.println("APROVADO - "+aprovado);
		System.out.println("REPROVADO - "+reprovado);
		System.out.println("EXAME FINAL - "+exameFinal);
	}
	
	public static void exibirPremiacao() {
		int ouro = 0;
		int prata = 0;
		int bronze = 0;
		double maior = 0;
		
		double[] nota = new double[notas.size()];
		
		
		for(int i = 0; i<=nota.length-1; i++) {
			nota[i] = notas.get(i);
			if(nota[i] > maior) {
				maior = nota[i];
				ouro = i;
			}
		}
		maior = 0;
		nota[ouro] = 0;
		
		for(int i = 0; i<=nota.length-1; i++) {
			
			if(nota[i] > maior) {
				maior = nota[i];
				prata = i;
			}
		}
		
		maior = 0;
		nota[prata] = 0;
		
		for(int i = 0; i<=nota.length-1; i++) {
			
			if(nota[i] > maior) {
				maior = nota[i];
				bronze = i;
			}
		}
		
		System.out.println(nomes.get(ouro) + ": OURO!");
		System.out.println(nomes.get(prata) + ": PRATA!");
		System.out.println(nomes.get(bronze) + ": BRONZE!");
		
		
		
	}
	
	public static String lerDado() {
		
		String texto = scanner.nextLine();
		
		return texto;
	}
	
	public static Integer lerDadoInt() {
		
		int inteiro = Integer.parseInt(scanner.nextLine());
		
		return inteiro;
	}
	
	public  static Double lerDadoDouble() {
		String nota = "";
		nota = scanner.nextLine();
		
		if(nota.contains(",")) {
			String[] notaCorrigido = nota.split(",");
			nota = notaCorrigido[0] + "." + notaCorrigido[1];
		}
		
		double valor = Double.parseDouble(nota);
		
		while(valor>10||valor<0) {
			System.out.println("Valor Invalido, Digite a nota Novamente: ");
			valor = Double.parseDouble(scanner.nextLine());
		}
		
		
		
		return valor;
	}

}
