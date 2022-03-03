package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Aluno;
import modelo.AlunoGraduacao;
import modelo.AlunoPosGraduacao;

/**
 * Servlet implementation class ControleAluno
 */
@WebServlet("/Controle.aluno")
public class ControleAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleAluno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Aluno aluno;
		String tipo = request.getParameter("rdbTipo");
		if(tipo.equals("Grad"))
			aluno = new AlunoGraduacao();
		else
			aluno = new AlunoPosGraduacao();
//		aluno.setMatricula
		aluno.setNome(request.getParameter("txtNome"));
		aluno.setTeste(Double.parseDouble(request.getParameter("txtTeste")));
		aluno.setProva(Double.parseDouble(request.getParameter("txtProva")));
		
		request.setAttribute("objAluno", aluno); // CALCULO MÉDIA
		
		RequestDispatcher despacho = request.getRequestDispatcher("consulta.jsp"); // PEGA DADOS DO "CONSULTA.JSP"
		despacho.forward(request, response); // ENCAMIINHA DADOS DE "CONSULTA.JSP" PARA O HTML
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
