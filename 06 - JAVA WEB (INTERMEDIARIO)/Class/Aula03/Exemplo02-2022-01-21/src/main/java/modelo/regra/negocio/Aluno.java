package modelo.regra.negocio;

public abstract class Aluno extends Pessoa {
	
	private String matricula;
	private double teste, prova;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getTeste() {
		return teste;
	}
	public void setTeste(double teste) {
		this.teste = teste;
	}
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		this.prova = prova;
	}
	
	// M?DIA
	public abstract double getMedia(); // QUUEM HERDAR VAI TER QUE IMPLEMENTAR ESSE METODO
}
