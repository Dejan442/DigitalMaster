

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Email
 */
public class Email extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private EmailSender emailSender;
	 
	 
	 
	 
	 @Override
	    public void init() throws ServletException {
	        String host = getServletContext().getInitParameter("smtpHost");
	        String port = getServletContext().getInitParameter("smtpPort");
	        String username = getServletContext().getInitParameter("dejanmilo666@gmail.com");
	        String password = getServletContext().getInitParameter("dejanmilo");

	        emailSender = new EmailSender(host, port, username, password);}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Email() {
        super();
        
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
		
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("myVariable");
		
		
		
		
		
			
		 String to = request.getParameter(email);
	        String subject = request.getParameter("subject");
	        String message = request.getParameter("Uspešno ste porčili");

	        try {
	            emailSender.sendEmail(to, subject, message);
	            response.getWriter().write("Mejl je uspešno poslat.");
	        } catch (Exception e) {
	            response.getWriter().write("Mejl nije poslat: " + e.getMessage());
	            e.printStackTrace();
	        }
		
		
		
		
		
		
	}

}
