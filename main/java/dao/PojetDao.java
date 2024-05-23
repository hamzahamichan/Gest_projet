package dao;

import java.util.List;

import metier.Projet;

public interface PojetDao {
  public Projet ajouter(Projet pr);
  public List<Projet>projetsParMC(String mc);
  public Projet getProjet(long id);
  public Projet update(Projet pr);
  public void deleteProduit(long id);
}
