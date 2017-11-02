import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {

		Pilha p = new Pilha();
		Scanner valor = new Scanner(System.in);
		String a = "s";

		while (true) {
			System.out.println("Deseja inserir um valor na pilha? 'S' / 'N' ");
			a = valor.next();

			if (a.equals("n") || a.equals("N")) {

				System.out.println("Voce digitou " + a
						+ " e com isso a insercao da pilha acabou \n");
				break;

			}
			if (p.isFull()) {
				System.out.println("Pilha cheia");
				System.exit(0);
			}
			if (a.equals("S") || a.equals("s")) {
				System.out.println("informe um valor para colocar na Pilha");
				int i = valor.nextInt();
				p.push(i);
			} else {
				System.out
						.println("Não foi escolhido nenhuma das duas opcoes (S/N)\n");
			}

		}

		while (!p.isEmpty()) {
			System.out.println("Deseja retirar um valor na pilha? 'S' / 'N' ");
			a = valor.next();

			if (a.equals("s") || a.equals("S")) {

				System.out.println("Insercao da pilha acabou \n");

				int fila = p.pop();
				System.out.println("desempilhando " + fila);
			}
			if (a.equals("n") || a.equals("N")) {

				System.out.println("Voce digitou " + a
						+ " e com isso o desempilhamento acabou \n");
				break;

			} else {
				System.out
						.println("Não foi escolhido nenhuma das duas opcoes (S/N)\n");
			}

			if (p.isEmpty()) {
				System.out.println("Pilha vazia");
				break;
			}

		}

	}
}
