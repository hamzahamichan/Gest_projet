package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.ImplProjetDao;
import dao.PojetDao;
import metier.Projet;

@WebServlet(name="cs",urlPatterns={"/*.java"})
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
		   else if(path.equals("/*.java")) {
			   String motCle = request.getParameter("motCle");
			   ProjetModel model = new ProjetModel();
			   model.setMotCle(motCle);
			   List<Projet> projets = dao.projetsParMC("%"+motCle+"%");
			   model.setProjets(projets);
			   request.setAttribute("model",model);
		   }
		   else  {
			   response.sendError(Response.SC_NOT_FOUND);
		   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
