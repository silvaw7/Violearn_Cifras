package aplicacao;
import util.ilustracoes;
import java.util.Scanner;
import modelo.*;

public class Main {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaStr = new Scanner(System.in);
		int menuEscolha;
		String nomeUser, senhaUser, emailUser, telefoneUser;
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
		
		System.out.println("O que deseja fazer? ");
		System.out.println("1 - Criar novo Usuário");
		System.out.println("2 - Criar nova lista de cifras");
		System.out.println("3 - Exibir listas de cifra"); menuEscolha = entrada.nextInt();
		
		switch(menuEscolha) {
		
		case 1:
			System.out.println(" --- Criação de novo usuário --- ");
			System.out.println("Qual seu nome ? : "); nomeUser = entradaStr.nextLine();
			Usuario novoUsuario = new Usuario();
			novoUsuario.setNome(nomeUser);
			
			System.out.println("Qual será sua senha: "); senhaUser = entradaStr.nextLine();
			novoUsuario.setSenha(senhaUser);
			
			System.out.println("Insira um endereço de email: "); emailUser = entradaStr.nextLine();
			novoUsuario.setEmail(emailUser);
			
			System.out.println("E por último um número de telefone:"); telefoneUser = entradaStr.nextLine();
			novoUsuario.setTelefone(telefoneUser);
			
			novoUsuario.setQtadeXp(0);
			System.out.println(" --- Usuário cadastrado --- ");
			novoUsuario.printUser(novoUsuario);
			
			// editar informações??
			// necessário criar vetor de usuários criados??
		case 2:
		case 3:
		}
			
	}
}
