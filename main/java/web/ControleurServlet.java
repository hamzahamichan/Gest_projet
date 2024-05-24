package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImplProjetDao;
import dao.PojetDao;
import metier.Projet;

/**
 * Servlet implementation class ControleurServlet
 */
public class ControleurServlet extends HttpServlet {
	
    private PojetDao dao;
    
    @Override
    public void init() throws ServletException {
    	dao= new ImplProjetDao();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String path=request.getServletPath();
		   if(path.equals("/*.java")) {
		 request.getRequestDispatcher("projets.jsp").forward(request, response);
		   }
		   if(path.equals("/*.java")) {
			   String motCle = request.getParameter("motCle");
			   ProjetModel model = new ProjetModel();
			   model.setMotCle(motCle);
			   List<Projet> projets = dao.projetsParMC(motCle);
			   request.setAttribute("model",model);
		   }
		    
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
