package metodos;

public class Carros {
	// Atributos 
			String cor;
			String modelo;
			double valor;
			boolean estado;
			
	//metodos contrutores - A assinatura do método é formada pelo seu NOME e pelo TIPO, QUANTIDADE e ORDEM de seus parâmetros
			
			public Carros() {
				
			}
			
			public Carros(String cor) {
				this.cor = cor;
			}
		
			public Carros(String cor,String modelo) {
				this.cor = cor;
				this.modelo = modelo;
			}
			
			public Carros(String cor, String modelo, double valor) {
				this.cor = cor;
				this.modelo = modelo;
				this.valor = valor;
			}
	// metodos 
			public void ligar() {
				if (estado == false) {
					estado = true;
					System.out.println("Carro ligado.");
				} else {
					System.out.println("Não foi possível ligar o carro, porque ele ja está ligado.");
				}
			}
			
			public void desligar() {
				if (estado == true) {
					estado = false;
					System.out.println("Carro desligado.");	
				} else {
					System.out.println("Não foi possível desligar o carro, porque ele ja está desligado.");
				}
			}
			
			public void status() {
				if (estado == true) {
				System.out.print("O carro está ligado \n");
			} else {
				System.out.print("O carro está desligado \n");
			}
			}
}
