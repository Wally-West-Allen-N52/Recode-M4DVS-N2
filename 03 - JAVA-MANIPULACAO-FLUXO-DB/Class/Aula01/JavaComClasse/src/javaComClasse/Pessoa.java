package javaComClasse;

public class Pessoa {

	private int cod;
	private String nome;
	private String telefone;
	private String enderaco;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEnderaco() {
		return enderaco;
	}
	public void setEnderaco(String enderaco) {
		this.enderaco = enderaco;
	}
	@Override
	public String toString() {
		return "Pessoa [cod=" + cod + ", nome=" + nome + ", telefone=" + telefone + ", enderaco=" + enderaco + "]";
	}
	
}
