package Usuario;

public class usuario {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private double salario;
	private String contato;
	
	
	usuario(String Nome, String CPF, String Contato, double Salario){
		this.nome = Nome;
		this.cpf = CPF;
		this.contato = Contato;
		this.salario = Salario;
	}
	

	void setDataNascimento(String newDataNascimento) { 
		this.dataNascimento = newDataNascimento; 
	}
	
	
	String getNome() {
		return nome;
	}
	
	String getCPF() {
		return cpf;
	}
	
	String getDataNascimento() {
		if(dataNascimento == null) {
			return "Usuário sem data de nascimento";
		} else {
			return dataNascimento;
		}
	}
	
	double getSalario() {
		return salario;
	}
	
	String getContato() {
		return contato;
	}
	
	
}
