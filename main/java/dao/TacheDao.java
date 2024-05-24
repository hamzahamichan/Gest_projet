package dao;

import java.util.List;

import metier.Tache;

public interface TacheDao {
	  public Tache ajouter(Tache t);
	  public List<Tache>tachesParMC(String mc);
	  public Tache getTache(int id);
	  public Tache update(Tache t);
	  public void deleteTache(int id);
}
