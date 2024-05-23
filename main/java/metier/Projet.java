package metier;

import java.sql.Date;

public class Projet {
	 private int id_project;
	 private String nom;
	 private String description;
	 private Date date_debut;
	 private Date date_fin;
	 private double budget;
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projet(String nom, String description, Date date_debut, Date date_fin, double budget) {
		super();
		this.nom = nom;
		this.description = description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.budget = budget;
	}
	public int getId_project() {
		return id_project;
	}
	public void setId_project(int id_project) {
		this.id_project = id_project;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	 
}
