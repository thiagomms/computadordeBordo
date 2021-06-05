

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class computador
 */
@WebServlet("/computador")
public class computador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public computador() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		float total = Float.parseFloat(request.getParameter("total"));
		float preco = Float.parseFloat(request.getParameter("preco"));
		float consumo = Float.parseFloat(request.getParameter("consumo"));

		float valor = total * preco;
		float distancia = total * consumo;
		
		request.setAttribute("valor", valor);
		request.setAttribute("distancia", distancia);
		
		request.getRequestDispatcher("computador.jsp").forward(request, response);
		
 
	}

}
