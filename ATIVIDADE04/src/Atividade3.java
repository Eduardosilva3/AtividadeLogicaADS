
public class Atividade3 {

	public static void main(String[] args) {
		
		System.out.println("Quantidade de vogais, amarelo: "+funcao1("amarelo"));
		System.out.println("Quantidade de vogais, A m A r E l o: "+funcao1("A m A r E l o"));
		System.out.println("Quantidade de vogais, aaaBBBcccDDDEEE: "+funcao1("aaaBBBcccDDDEEE"));
		System.out.println("");
		System.out.println("quantidade de palavra da frase: 'Hoje é quarta': " + funcao2("Hoje é quarta"));
		System.out.println("quantidade de palavra da frase: 'A prova de Lógica será dia 25': " + funcao2("A prova de Lógica será dia 25"));
		System.out.println("");
		System.out.print("Nome corrigido 'jose maria': ");
		funcao3("jose maria");
		System.out.println(" ");
		System.out.print("Nome corrigido 'JOSE maria': ");
		funcao3("JOSE maria");
		System.out.println(" ");
		System.out.print("Nome corrigido 'jOSE MAria': ");
		funcao3("jOSE MAria");
		

	}
	
	
	
	
	public static int funcao1(String nome) {
		int contador = 0;
		String nomeM = nome.toLowerCase();
		
		for(int i = 0; i <= nomeM.length()-1;i++) {
			
			
			 
			if((nomeM.charAt(i) == 'a')||(nomeM.charAt(i) == 'e')||(nomeM.charAt(i) == 'i')||(nomeM.charAt(i) == 'u')||(nomeM.charAt(i) == 'o')){
				contador++;
			}
		}
		
		return(contador);
	}
	
	
	public static int funcao2(String palavras) {
		
		String [] s = palavras.split(" ");
		
		return(s.length);
		
	}
	
	public static void funcao3(String nome) {
		String [] s = nome.split(" ");
		String [] nomeConvertido = new String[s.length];
 		
		
 		for(int i = 0; i < s.length;i++ ) {
			
 			nomeConvertido[i] = s[i].toLowerCase();
			
			for(int j = 0; j < nomeConvertido.length;j++) {
				
				char letraM = nomeConvertido[i].charAt(0);
				
				String conveM = (letraM+"").toUpperCase();
				String nomeRestante = nomeConvertido[i].substring(1, nomeConvertido[i].length());
				nomeConvertido[i] = conveM + nomeRestante;
				
				
			}
			
		}
 		
 	  for(int i = 0; i < nomeConvertido.length; i++) {
 		  System.out.print(nomeConvertido[i]+" ");
 	  }
		
		
	}
	
	

}
