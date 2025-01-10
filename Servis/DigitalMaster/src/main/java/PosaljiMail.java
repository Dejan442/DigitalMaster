

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PosaljiMail
 */
public class PosaljiMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PosaljiMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// Postavite vašu e-mail adresu za primaoca
        String to = "dejanmilo666@gmail.com"; // Zamenite sa vašim e-mailom

        // Gmail URL sa parametrima (samo 'to' je postavljen)
        String gmailUrl = "https://mail.google.com/mail/?view=cm&fs=1&to=" + to;

        // Preusmerite korisnika na Gmail
        response.sendRedirect(gmailUrl);
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Postavite vašu e-mail adresu za primaoca
        String to = "dejanmilo666@gmail.com"; // Zamenite sa vašim e-mailom

        // Gmail URL sa parametrima (samo 'to' je postavljen)
        String gmailUrl = "https://mail.google.com/mail/?view=cm&fs=1&to=" + to;

        // Preusmerite korisnika na Gmail
        response.sendRedirect(gmailUrl);
	}

}
