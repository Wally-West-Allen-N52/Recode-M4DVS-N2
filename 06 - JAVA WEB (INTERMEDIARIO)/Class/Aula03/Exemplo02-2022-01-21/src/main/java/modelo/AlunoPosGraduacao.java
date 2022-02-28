package modelo;

public class AlunoPosGraduacao extends Aluno {

	public double getMedia() {
		return (getTeste() + getProva())/2;
	}
}
