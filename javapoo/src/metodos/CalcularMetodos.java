package metodos;

public class CalcularMetodos {
	int somar(int a, int b) {
		return a + b;
	}
// metodo possui o mesmo nome, porém com assinaturas diferentes.	
	int somar(int a, int b, int c) {
		return a + b + c;
	}
	
	int subtrair(int a, int b) {
		return a - b;
	}
	
	int multiplicar(int a, int b) {
		return a * b;
	}
	
	int dividir(int a, int b) {
		return a / b;
	}
	
}
