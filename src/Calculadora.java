import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner $ = new Scanner(System.in);
		 
		Numero n1 = new Numero(); 
		Numero n2 = new Numero(); 
		Numero res = new Numero(); 		
		String opc = "S";
		int opcao = 0,opcao1 = 0;
		
		// while para retornar do come�o
		while(opc.equals("s")|| opc.equals("S")){
		
		// menu das opera��es
		String opcoes[] = {"Somar", "Subtrair", "Multiplicar", "Dividir"};
		opcao = JOptionPane.showOptionDialog(null, "Escolha uma op��o", "CALCULADORA", 0, JOptionPane.QUESTION_MESSAGE, null,
				opcoes, opcoes[0]);
		
		// switch para controlar as op��es
		switch(opcao){
		// case para especificar a op��o
		case 0:
		System.out.println("Digite um valor");
		n1.setValor($.nextInt());
		System.out.println("Digite um valor");
		n2.setValor($.nextInt());
		res.setValor(n1.getValor() + n2.getValor());
		System.out.printf("A soma de %d com %d � igual a %d",n1.getValor(),n2.getValor(),res.getValor());
		System.out.println("\nDeseja somar outros valores?");
		opc=$.next();
		System.out.println("\n\n\n");
		
		break;
		
		case 1:
			System.out.println("Digite um valor");
			n1.setValor($.nextInt());
			System.out.println("Digite um valor");
			n2.setValor($.nextInt());
			res.setValor(n1.getValor() - n2.getValor());
			System.out.printf("A subtra��o de %d com %d � igual a %d",n1.getValor(),n2.getValor(),res.getValor());
			System.out.println("\nDeseja subtrair outros valores?");
			opc=$.next();
			System.out.println("\n\n\n");
	  
		break;
		
		case 2:
			System.out.println("Digite um valor");
			n1.setValor($.nextInt());
			System.out.println("Digite um valor");
			n2.setValor($.nextInt());
			res.setValor(n1.getValor() * n2.getValor());
			System.out.printf("A multplica��o de %d com %d � igual a %d",n1.getValor(),n2.getValor(),res.getValor());
			System.out.println("\nDeseja multplicar outros valores?");
			opc=$.next();
			System.out.println("\n\n\n");
			
		break;
		
		case 3:
			System.out.println("Digite um valor");
			n1.setValor($.nextInt());
			System.out.println("Digite um valor");
			n2.setValor($.nextInt());
			res.setValor(n1.getValor() / n2.getValor());
			System.out.printf("A divis�o de %d com %d � igual a %d",n1.getValor(),n2.getValor(),res.getValor());
			System.out.println("\nDeseja dividir outros valores?");
			opc=$.next();
			System.out.println("\n\n\n");
	  }
	}	
  }	
}
	