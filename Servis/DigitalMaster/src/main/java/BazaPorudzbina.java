

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.mail.internet.InternetAddress;

import com.mysql.cj.Session;

/**
 * Servlet implementation class BazaPorudzbina
 */
public class BazaPorudzbina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BazaPorudzbina() {
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
		
		
		String racunar=request.getParameter("vrednost");
		String Ime=request.getParameter("ime");
		String Prezime=request.getParameter("prezime");
		String Email=request.getParameter("email");
		
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Servis","root","Dejan");
			
			PreparedStatement ps=con.prepareStatement("insert into prodaja values(?,?,?,?)");
			
		
			
			ps.setString(1, racunar);
			ps.setString(2, Ime);
			ps.setString(3, Prezime);
			ps.setString(4, Email);
			
			int i =ps.executeUpdate();
			
			if(i>0) {
				
				HttpSession session = request.getSession();
				session.setAttribute("myVariable", Email);

				
				
				response.sendRedirect("EmailServlet");
				
			
				
				
				
				
				
			}
			
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
	}

}
