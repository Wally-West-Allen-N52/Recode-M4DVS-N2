package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Funcionario;

/**
 * Servlet implementation class funcDados
 */
@WebServlet("/Controle.funcionario")
public class ControleDeFuncionarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleDeFuncionarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Funcionario funcionario = new Funcionario(); // OBJ FUNCIONARIO
		
		// DADOS OBTIDOS/GET DO INDEX.HTML 
		funcionario.setNome(request.getParameter("txtNome"));
		funcionario.setMatricula(Integer.parseInt(request.getParameter("txtMatricula")));
		funcionario.setSalarioBruto(Double.parseDouble(request.getParameter("txtSalario")));
	
				
		// ENVIA DADOS DE FUNCIONARIO PARA OBJ INSTANCIADO EM "CONSULTA"
		request.setAttribute("objFuncionario", funcionario);
		RequestDispatcher enviaDado = request.getRequestDispatcher("Consulta.jsp");
		enviaDado.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
