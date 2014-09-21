package servletit;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//servlettiharjoitus
//itsen�iseen tutustumiseen 
//kommentoi koodi
/**
 * Servlet implementation class Kasittele
 * @author altlag
 */
@WebServlet("/Kasittele")
public class Kasittele extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kasittele() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessio = request.getSession();
		RequestDispatcher disp;
		String formParam = request.getParameter("muuttuja");
		System.out.println(formParam); //poista n�m� kun olet tutustunut koodiin
		if (formParam.length()>5){
			sessio.setAttribute("juttu", formParam + ", pituus: " + formParam.length());
		}
		else{
			sessio.setAttribute("juttu", "Alimittainen sy�te");
		}
		disp = request.getRequestDispatcher("tulos.jsp");
		request.setAttribute("sArttr", "Servletiss� lis�tty teksti");
		Enumeration<String> lista = request.getParameterNames();
		while (lista.hasMoreElements()){
			System.out.println(lista.nextElement());
		}
		//System.out.println(request.getParameter("sessionid"));
		
		disp.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
