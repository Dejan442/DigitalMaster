

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ProveraLogovanja
 */
public class ProveraLogovanja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProveraLogovanja() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String korisnickoIme=request.getParameter("ime");
		String Lozinka=request.getParameter("lozinka");
		
		
		if((korisnickoIme.equals("DigitalMaster"))&&(Lozinka.equals("Vlasnik"))) {
			
		
		request.getSession().setAttribute("REGISTROVAN", korisnickoIme);
		response.sendRedirect("StrZaRegistrovane.html");
		
	}
		else {
			response.sendRedirect("Greska.html");
		}

}
}
