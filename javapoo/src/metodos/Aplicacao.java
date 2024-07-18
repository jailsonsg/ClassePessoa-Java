package metodos;

public class Aplicacao {

	public static void main(String[] args) {		
		
		Carros carroPadrao = new Carros();
		System.out.printf("O carro é modelo %s tem a cor %s e o seu valor é %.2f,", carroPadrao.modelo,carroPadrao.cor,carroPadrao.valor);
		carroPadrao.status();
		carroPadrao.ligar();
		carroPadrao.desligar();
		carroPadrao.status();
		
		Carros carroBranco = new Carros("Branco");
		System.out.printf("O carro é modelo %s tem a cor %s e o seu valor é %.2f,", carroBranco.modelo,carroBranco.cor,carroBranco.valor);
		carroBranco.status();
		carroBranco.ligar();
		carroBranco.desligar();
		carroBranco.status();
		
		Carros celtaPreto = new Carros("Preto","Celta");
		System.out.printf("O carro é modelo %s tem a cor %s e o seu valor é %.2f,", celtaPreto.modelo,celtaPreto.cor,celtaPreto.valor);
		celtaPreto.status();
		celtaPreto.ligar();
		celtaPreto.desligar();
		celtaPreto.status();
		
		Carros civicPrata = new Carros("Prata","Civic",259.900);
		System.out.printf("O carro é modelo %s tem a cor %s e o seu valor é %.2f,", civicPrata.modelo,civicPrata.cor,civicPrata.valor);
		civicPrata.status();
		civicPrata.ligar();
		civicPrata.desligar();
		civicPrata.status();
	}

}
