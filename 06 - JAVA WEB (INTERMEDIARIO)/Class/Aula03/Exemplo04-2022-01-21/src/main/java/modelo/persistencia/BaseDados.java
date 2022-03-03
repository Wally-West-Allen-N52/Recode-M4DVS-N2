package modelo.persistencia;

import java.util.HashMap;

import modelo.pessoal.Funcionario;

public class BaseDados {

	private HashMap<String, Funcionario> dadosFuncionario = null;
	private Funcionario funcionario = null;
	
	public BaseDados() {
		dadosFuncionario = new HashMap<String, Funcionario>();
		incluirFuncionario();
	}
	
	private void incluirFuncionario() {
		funcionario = new Funcionario();
		
		funcionario.setMatricula("123");
		funcionario.setNome("Wallace");
		funcionario.setSalarioBrutto(4500);
		
		dadosFuncionario.put(funcionario.getMatricula(), funcionario);
	}

	public HashMap<String, Funcionario> getDadosFuncionario() {
		return dadosFuncionario;
	}
	
	
}
