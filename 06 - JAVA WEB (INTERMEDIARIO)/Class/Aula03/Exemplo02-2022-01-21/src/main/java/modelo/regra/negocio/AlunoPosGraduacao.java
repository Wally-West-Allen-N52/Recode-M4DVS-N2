package modelo.regra.negocio;

public class AlunoPosGraduacao extends Aluno {

	public double getMedia() { // M�TODO HERDADO DE ALUNO
		return (getTeste()+getProva())/2;
	}
}
