package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.Projet;
import metier.Tache;

public class TacheImpl implements TacheDao {

	@Override
	public Tache ajouter(Tache t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tache> tachesParMC(String mc) {
	     List<Tache> taches = new ArrayList<Tache>();
	     Connection cn = DatabaseConnection.getConnection();
	     try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM tache WHERE nom LIKE ?");
			ps.setString(1,mc);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Tache t = new Tache();
				t.setId_tache(rs.getInt("id tache"));
				t.setNom(rs.getString("Nom"));
				t.setId_ressource(rs.getInt("Id_ressource"));
				t.setDateDebut(rs.getDate("DateDebut"));
				t.setDateFin(rs.getDate("DateFin"));
				t.setDescription(rs.getString("Description"));
				t.setNom(rs.getString("Nom"));
				taches.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Tache getTache(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tache update(Tache t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTache(int id) {
		// TODO Auto-generated method stub
		
	}

}
