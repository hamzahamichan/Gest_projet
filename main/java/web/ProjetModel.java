package web;

import java.util.ArrayList;
import java.util.List;

import metier.Projet;

public class ProjetModel {
  private String motCle;
  private List<Projet> projets = new ArrayList<Projet>();
public String getMotCle() {
	return motCle;
}
public void setMotCle(String motCle) {
	this.motCle = motCle;
}
public List<Projet> getProjets() {
	return projets;
}
public void setProjets(List<Projet> projets) {
	this.projets = projets;
}
  
}
