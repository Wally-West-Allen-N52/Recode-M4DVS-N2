package modelo;

public class Funcionario {

	private String nome;
	private int matricula;
	private double salarioBruto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	// CALCULO INSS
	public double getINSS() {
		return salarioBruto * 0.11;
	}

	//CALCULO SALÁRIO LIQUIDO
	public double getSalarioLiquido() {
		return salarioBruto - getINSS();
	}
}
