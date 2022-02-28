package javaComClasse;

public class Produto {

	private int cod;
	private String descricao;
	private double preco;
	
	// MÉTODO CONSTRUTOOR VAZIO ASSISTIDO POR "JAVACOMCLASSE/PRODUTINHO2"
//	public Produto () {
//		
//	}
	// MÉTODO CONSTRUTOR COM PARÂMETROS ASSISTIDO POR "JAVACOMCLASSE/PRODUTINHO"
//	public Produto(int cod, String descricao, double preco) {
//		super();
//		this.cod = cod;
//		this.descricao = descricao;
//		this.preco = preco;
//	}
	public int getCod() { // "GET" = OBTER, QUE RETORNA "THIS.COD"
		return cod; // RETORNO DO VALOR ARMAZENADO NO ATRIBUTO
	}
	public void setCod(int codigo) { // PARÂMETRO = A REFERÊNCIA
		this.cod = codigo; // OS NOMES NÃO PRECISÃO SER IGUAIS AOS NOMES DOS ATRIBUTOS
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
				+ "\nDescrição.Produo: " + descricao
				+ "\nPreco.Produto: " + preco;
	}
	
}
