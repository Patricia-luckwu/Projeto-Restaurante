package model;

public class Pessoa {

	private String nome;
	private String cpf;
	private int dataNascimento;
	private String enderešo;
	private int telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeCliente) {
		this.nome = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", enderešo=" + enderešo
				+ ", telefone=" + telefone + "]";
	}

}
