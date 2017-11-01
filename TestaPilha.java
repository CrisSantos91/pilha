import java.util.Scanner;

public class TestaPilha {
	public static void main(String[] args) {

		Pilha p = new Pilha();
		Scanner valor = new Scanner(System.in);
		String a = "s";

		while (!a.equals("n") || !p.isFull()) {
			System.out
					.println("Deseja inserir um valor na pilha? 'S' / ou 'N' ");
			a = valor.next();

			if (a.equals("n") || a.equals("N")) {
				System.out.println("Insercao da pilha acabou");
				System.exit(0);

			}

			if (p.isFull()) {
				System.out.println("Pilha cheia");
				System.exit(0);
			}
			System.out.println("informe um valor para colocar na Pilha");
			int i = valor.nextInt();
			p.push(i);

		}

		while (!p.isEmpty()) {
			int fila = p.pop();
			System.out.println("desempilhando " + fila);

		}

	}
}
