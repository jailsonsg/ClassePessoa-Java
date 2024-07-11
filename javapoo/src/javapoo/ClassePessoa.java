package javapoo;

public class ClassePessoa {
	String nome;
	boolean statuscomer = false;
	boolean statusandar = false;
	boolean statusfalar = false;
	
	public void comer() {
		if (statuscomer == false && statusandar == false && statusfalar == false) {
			System.out.printf("%S está comendo.",nome);
			statuscomer = true;
		} else if (statuscomer == true) {
			System.out.printf("%S Não pode comer porque ja está comendo",nome);
		} else if (statuscomer == false && statusandar == true && statusfalar == false) {
			System.out.printf("%S Não pode comer porque está andando",nome);
		} else if (statuscomer == false && statusandar == false && statusfalar == true) {
			System.out.printf("%S Não pode comer porque está falando",nome);
		} 
	}
	
	public void parardecomer() {
		if (statuscomer == true) {
			System.out.printf("%S parou de comer.",nome);
			statuscomer = false;
		} else {
			System.out.printf("%S não pode parar de comer porque não está comendo.");
		}
	}
	
	public void andar() {
		if (statuscomer == false && statusandar == false && statusfalar == false) {
			System.out.printf("%S está andando.",nome);
			statusandar = true;
		} else if (statusandar == true) {
			System.out.printf("%S Não pode andar porque ja está andando",nome);
		} else if (statusandar == false && statuscomer == true && statusfalar == false) {
			System.out.printf("%S Não pode andar porque está comendo",nome);
		} else if (statusandar == false && statuscomer == false && statusfalar == true) {
			System.out.printf("%S Não pode andar porque está falando",nome);
		} 
	}
	
	public void parardeandar() {
		if (statusandar == true) {
			System.out.printf("%S parou de andar.",nome);
			statusandar = false;
		} else {
			System.out.printf("%S não pode parar de andar porque não está andando.");
		}
	}

	
	public void falar() {
		if (statusfalar == false && statusandar == false && statuscomer == false) {
			System.out.printf("%S está falando.",nome);
			statusfalar = true;
		} else if (statusfalar == true) {
			System.out.printf("%S Não pode falar porque ja está falando",nome);
		} else if (statusfalar == false && statuscomer == true && statusandar == false) {
			System.out.printf("%S Não pode falar porque está comendo",nome);
		} else if (statusfalar == false && statuscomer == false && statusandar == true) {
			System.out.printf("%S Não pode falar porque está andando",nome);
		} 
	}
	
	public void parardefalar() {
		if (statusfalar == true) {
			System.out.printf("%S parou de falar.",nome);
			statusfalar = false;
		} else {
			System.out.printf("%S não pode parar de falar porque não está falando.");
		}
	}
	
}
