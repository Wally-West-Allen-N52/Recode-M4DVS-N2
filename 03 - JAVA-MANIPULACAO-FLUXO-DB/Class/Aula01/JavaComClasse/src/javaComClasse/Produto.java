package javaComClasse;

public class Produto {

	private int cod;
	private String descricao;
	private double preco;
	
	// M�TODO CONSTRUTOOR VAZIO ASSISTIDO POR "JAVACOMCLASSE/PRODUTINHO2"
//	public Produto () {
//		
//	}
	// M�TODO CONSTRUTOR COM PAR�METROS ASSISTIDO POR "JAVACOMCLASSE/PRODUTINHO"
//	public Produto(int cod, String descricao, double preco) {
//		super();
//		this.cod = cod;
//		this.descricao = descricao;
//		this.preco = preco;
//	}
	public int getCod() { // "GET" = OBTER, QUE RETORNA "THIS.COD"
		return cod; // RETORNO DO VALOR ARMAZENADO NO ATRIBUTO
	}
	public void setCod(int codigo) { // PAR�METRO = A REFER�NCIA
		this.cod = codigo; // OS NOMES N�O PRECIS�O SER IGUAIS AOS NOMES DOS ATRIBUTOS
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco; 
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "\nCod.Produto: " + cod
				+ "\nDescri��o.Produo: " + descricao
				+ "\nPreco.Produto: " + preco;
	}
	
}
