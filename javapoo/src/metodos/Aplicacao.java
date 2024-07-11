package metodos;

public class Aplicacao {

	public static void main(String[] args) {		
		
		Carros carroPadrao = new Carros();
		System.out.printf("Modelo:" + carroPadrao.modelo + " Cor:" + carroPadrao.cor + " Valor:" + carroPadrao.valor + "\n");
		carroPadrao.status();
		carroPadrao.ligar();
		carroPadrao.desligar();
		carroPadrao.status();
		
		Carros carroBranco = new Carros("Branco");
		System.out.printf("Modelo:" + carroBranco.modelo + " Cor:" + carroBranco.cor + " Valor:" + carroBranco.valor + "\n");
		carroBranco.status();
		carroBranco.ligar();
		carroBranco.desligar();
		carroBranco.status();
		
		Carros celtaPreto = new Carros("Preto","Celta");
		System.out.printf("Modelo:" + celtaPreto.modelo + " Cor:" + celtaPreto.cor + " Valor:" + celtaPreto.valor + "\n");
		celtaPreto.status();
		celtaPreto.ligar();
		celtaPreto.desligar();
		celtaPreto.status();
		
		Carros civicPrata = new Carros("Prata","Civic",259.900);
		System.out.printf("Modelo:" + civicPrata.modelo + " Cor:" + civicPrata.cor + " Valor:" + civicPrata.valor + "\n");
		civicPrata.status();
		civicPrata.ligar();
		civicPrata.desligar();
		civicPrata.status();
	}

}
