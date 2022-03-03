package modelo.persistencia;

import java.util.HashMap;

import modelo.negocio.Aluno;

public class Banco {

	private HashMap<String, Aluno> TabelaAluno;
	
	private Aluno aluno;
	
	public Banco() {
		TabelaAluno = new HashMap<String, Aluno>();
		
		aluno = new Aluno();
		aluno.setMatricula("022");
		aluno.setNome("Wallace");
		
		TabelaAluno.put(aluno.getMatricula(), aluno);
		
		aluno = new Aluno();
		aluno.setMatricula("456");
		aluno.setNome("Nathally");
		
		TabelaAluno.put(aluno.getMatricula(), aluno);
	}

	public HashMap<String, Aluno> getTabela() {
		return TabelaAluno;
	}
	
	
}
