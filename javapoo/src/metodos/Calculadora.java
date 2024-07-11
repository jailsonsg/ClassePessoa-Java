package metodos;

public class Calculadora {
	public static void main(String[]args) {
		CalcularMetodos calc1 = new CalcularMetodos();
		int resposta = calc1.somar(2, 4);
		int resposta2 = calc1.somar(2, 4, 5);
		int subtracao = calc1.subtrair(5, 2);
		int multiplicacao = calc1.multiplicar(2, 3);
		int divisao = calc1.dividir(10, 2);
		System.out.printf("%d %d %d %d %d",resposta,resposta2,subtracao,multiplicacao,divisao);		
	}
}
