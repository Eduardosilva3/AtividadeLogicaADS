package edu.eduardo.exercicio3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
        int N= scan.nextInt();
        String string = scan.nextLine();
    
    
    //quebra string em várias substrings a partir de um caractere
        String[] s = string.split(" ");
        for(String texto : s) {
        	System.out.println(texto);
        }
        double[] idade = new double[N];

        for (int i = 0; i < N; i++)
        { 
        	//ade[i] = Double.parseDouble(texto);
        	
        
            
        }


        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++)
        {
            if (idade[i] < 18 )
            {
                System.out.println(     idade[i]    );
            }

        }

	}

}
