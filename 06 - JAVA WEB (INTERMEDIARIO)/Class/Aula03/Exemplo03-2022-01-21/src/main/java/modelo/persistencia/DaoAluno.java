package modelo.persistencia;

import java.util.HashMap;

import modelo.negocio.Aluno;

// CLASSE QUE GERA OBJ QUA VAI ACESSAR OS DADOS DO ALUNO
public class DaoAluno { // Data Access Object

	Banco banco;
	HashMap<String, Aluno> tabelaAluno;
	
	public DaoAluno() {
		banco = new Banco();
		tabelaAluno = banco.getTabela();
	}
	
	public void incluir(Aluno aluno) {

	}

	public void excluir(Aluno aluno) {

	}

	public void alterar(Aluno aluno) {

	}

	public Aluno consultar(Aluno aluno) {
		return tabelaAluno.get(aluno.getMatricula());
	}

}
