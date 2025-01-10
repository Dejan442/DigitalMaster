

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class BazaKontakt
 */
public class BazaKontakt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BazaKontakt() {
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
	
		
		
		String Ime=request.getParameter("ime");
		String Prezime=request.getParameter("prezime");
		String Mail=request.getParameter("email");
	String Komentar=request.getParameter("komentar");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Servis","root","Dejan");
			
			PreparedStatement ps=con.prepareStatement("insert into kontakt1 values(?,?,?,?)");
			
		
			
			ps.setString(1, Ime);
			ps.setString(2, Prezime);
			ps.setString(3, Mail);
			ps.setString(4, Komentar);
			
			int i =ps.executeUpdate();
			
			if(i>0) {
				
				response.sendRedirect("UspesnoUpisano.html");
				
			}
			
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		
	}

}
