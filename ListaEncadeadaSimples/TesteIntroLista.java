package introducao.lista.encadeada.unicap;


import java.util.Scanner;

public class TesteIntroLista {
	
	public static void banner() {
		System.out.println("[+] MENU [+] \t\n"
				+ "[+] 1 - INSERIR INICIO  [+]\n"
				+ "[+] 2 - INSERIR FINAL  [+]\n"
				+ "[+] 3 - EXIBIR [+]\n"
				+ "[+] 4 - SAIR  [+]\n");
	}

	public static void main(String[] args) {
		List lista = new List();
		Scanner op = new Scanner(System.in );
		while(true) {
			banner();
			int opcao = op.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("[-] Digite o valor para inserir: ");
				int valor = op.nextInt();
				lista.inserirInicio(valor);
				break;
			case 2:
				System.out.println("[-] Digite o valor para no final: ");
				int valor2 = op.nextInt();
				lista.inserirFinal(valor2);
				break;
			case 3:
				lista.Exibir();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("[+] Error..");
			}
		}
	} // end main

}
