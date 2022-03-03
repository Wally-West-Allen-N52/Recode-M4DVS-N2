package modelo.regra.negocio;

public class AlunoGraduacao extends Aluno{

	public double getMedia() { // MÉTODO HERDADO DE ALUNO
		return (getTeste()+getProva()*2)/3;
	}
}
