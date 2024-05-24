package metier;

public class Ressource {
	    private int id_ressource;
	    private String nom;
	    private String type;
	    private int quantite;
	    private String infoFournisseur;
	    
		public Ressource() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getQuantite() {
			return quantite;
		}
		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}
		public String getInfoFournisseur() {
			return infoFournisseur;
		}
		public void setInfoFournisseur(String infoFournisseur) {
			this.infoFournisseur = infoFournisseur;
		}
		public Ressource(String nom, String type, int quantite, String infoFournisseur) {
			super();
			this.nom = nom;
			this.type = type;
			this.quantite = quantite;
			this.infoFournisseur = infoFournisseur;
		}
	    
}
