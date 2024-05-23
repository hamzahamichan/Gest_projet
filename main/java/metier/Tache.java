package metier;

import java.sql.Date;

public class Tache {
	private int id_tache; 
    private int id_projet; 
    private int id_ressource;
    private String nom ;
    private String description ;
    private Date dateDebut;
    private Date dateFin;
    private String status;
	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tache(int id_projet, int id_ressource, String nom, String description, Date dateDebut, Date dateFin,
			String status) {
		super();
		this.id_projet = id_projet;
		this.id_ressource = id_ressource;
		this.nom = nom;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.status = status;
	}
	public int getId_tache() {
		return id_tache;
	}
	public void setId_tache(int id_tache) {
		this.id_tache = id_tache;
	}
	public int getId_projet() {
		return id_projet;
	}
	public void setId_projet(int id_projet) {
		this.id_projet = id_projet;
	}
	public int getId_ressource() {
		return id_ressource;
	}
	public void setId_ressource(int id_ressource) {
		this.id_ressource = id_ressource;
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}
