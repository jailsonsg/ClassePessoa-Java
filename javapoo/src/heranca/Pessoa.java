package heranca;
import java.util.Date;

public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	//metodo construtor
	public Pessoa(String nome, String cpf, Date data) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data;
	}
}
