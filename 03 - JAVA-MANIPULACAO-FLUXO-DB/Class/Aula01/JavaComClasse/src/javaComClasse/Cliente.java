package javaComClasse;


public class Cliente extends Pessoa{

	private String dataCadastro;

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Cliente [dataCadastro=" + dataCadastro + ", getCod()=" + getCod() + ", getNome()=" + getNome()
				+ ", getTelefone()=" + getTelefone() + ", getEnderaco()=" + getEnderaco() + ", toString()="
				+ super.toString() + "]";
	}

	
}
