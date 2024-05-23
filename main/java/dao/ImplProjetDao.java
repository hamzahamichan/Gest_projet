package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Projet;

public class ImplProjetDao implements PojetDao {

	@Override
	public Projet ajouter(Projet pr) {
		Connection cn = DatabaseConnection.getConnection();
		try {
			PreparedStatement ps = cn.prepareStatement("INSERT INTO project(nom,description,dateDebut,dateFin,budget)VALUES(?,?,?,?,?)");
			ps.setString(1,pr.getNom());
			ps.setString(2,pr.getDescription());
			ps.setDate(3,pr.getDate_debut());
			ps.setDate(4,pr.getDate_fin());
			ps.setDouble(5,pr.getBudget());
			ps.executeUpdate();
			PreparedStatement ps1=cn.prepareStatement("select MAX(id_project) AS MAXid_project FROM Project");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				pr.setId_project(rs.getInt("MAXid_project"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pr;
	}

	@Override
	public List<Projet> projetsParMC(String mc) {
		List<Projet> projets = new ArrayList<Projet>();
		Connection cn = DatabaseConnection.getConnection();
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM projet WHERE nom LIKE ?");
			ps.setString(1,mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Projet pr = new Projet();
				pr.setId_project(rs.getInt("id_project"));
				pr.setDescription(rs.getString("description"));
				pr.setDate_debut(rs.getDate("date_debut"));
				pr.setDate_fin(rs.getDate("date_fin"));
				pr.setBudget(rs.getDouble("budget"));
				projets.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projets;
	}

	@Override
	public Projet getProjet(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projet update(Projet pr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int id) {
		// TODO Auto-generated method stub
		
	}

}
