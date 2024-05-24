package dao;

import java.sql.Connection;
import java.sql.Date;
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
		Connection cn = DatabaseConnection.getConnection();
		try {
			PreparedStatement ps = cn.prepareStatement("INSERT INTO tache(nom,description,dateDebut,dateFin,status)VALUES(?,?,?,?,?)");

			ps.setString(1,t.getNom());
			ps.setString(2,t.getDescription());
			ps.setDate(3,t.getDateDebut());
			ps.setDate(4,t.getDateFin());
			ps.setString(5,t.getStatus());
			ps.executeUpdate();
			PreparedStatement ps1=cn.prepareStatement("select MAX(id_tache) AS MAXid_tache FROM tache");
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				t.setId_tache(rs.getInt("MAXid_tache"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
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
				t.setId_tache(rs.getInt("id_tache"));
				t.setId_projet(rs.getInt("id_projet"));
				t.setId_ressource(rs.getInt("Id_ressource"));
				t.setNom(rs.getString("nom"));
				t.setDescription(rs.getString(" description"));
				t.setDateDebut(rs.getDate("dateDebut"));
				t.setDateFin(rs.getDate("dateFin"));
				t.setStatus(rs.getString("status"));
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
		Connection cn = DatabaseConnection.getConnection();
		List<Tache>taches = new ArrayList<Tache>();
		
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
