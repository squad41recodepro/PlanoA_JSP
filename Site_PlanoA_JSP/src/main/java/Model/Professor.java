package Model;

public class Professor {

	protected int idProfessor;
	protected String nome;
	protected String cpf;
	protected String formacao;

	public Professor(int idProfessor, String nome, String cpf, String formacao) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.cpf = cpf;
		this.formacao = formacao;
	}

	public Professor() {

	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public void alterarNome() {

	}

	public void inserirPlano() {

	}

}
