public class Pilha {
	int vetor[];
	int inicio;

	public Pilha() {
		vetor = new int[2];
		inicio = -1;
	}

	public void push(int e) {
		if (isFull()) {
			throw new RuntimeException("Stack Overflow!");
		}
		inicio++;
		vetor[inicio] = e;

	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Empty Stack!");
		}
		int e;
		e = vetor[inicio];
		inicio--;

		return e;
	}

	public boolean isEmpty() {
		return (inicio == -1);
	}

	public boolean isFull() {
		return (inicio == vetor.length - 1);
	}

	public int min() {

		int menor = Integer.MAX_VALUE;
		for (int i = 0; i <vetor.length; i++) {

			if (vetor[i] < menor) {
				menor = vetor[i];
			} else {
				return menor;
			}

		}
		return menor;
	}
}
