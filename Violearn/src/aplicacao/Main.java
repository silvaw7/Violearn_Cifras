package aplicacao;
import util.ilustracoes;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		int sentinelaMenu;
		///////////////////
		// MENU INICIAL
		//////////////////
		
		System.out.println("Bem vindo ao VIOLEARN");
		System.out.println(" "); // espaço em branco;
		ilustracoes ilustracao = new ilustracoes(); // simbolos musicais
        ilustracao.exibirIlustracao();
        System.out.println(" "); // espaço em branco;
		System.out.println("O programa ainda está em desenvolvimento, mas aqui você poderá:");
		System.out.println("- Criar coleção de cifras");
		System.out.println("- Criar um novo usuário");
		System.out.println(" -----------------------");
		System.out.println("Aperte 1 para continuar, 0 para fechar o programa"); sentinelaMenu = entrada.nextInt();
		
		switch (sentinelaMenu){
		case 0:
			break;
		case 1:
			System.out.println("O que deseja fazer? ");
			System.out.println("1 - Criar novo Usuário");
			System.out.println("2 - Criar nova lista de cifras");
			System.out.println("3 - Exibir listas de cifra");
			
		}
	}
}
