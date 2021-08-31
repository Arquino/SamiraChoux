
// Encherisseur qui herite de personne
public class Encherisseur extends Personne {
	
	//Les atrributs Encherisseur
	public int miseLimite;
	public String etat = "in";
	
	 public Encherisseur(String prenom, String nom,  int miseLimite, String etat) {
	        
	        this.nom = nom;
	        this.prenom = prenom;
	        this.miseLimite = miseLimite;
	        this.etat = etat;
	        System.out.println(prenom + " " + nom + " mise limite: "+ miseLimite + "  état  " + etat);
	    }
	// méthode principale (main de Encherisseur)
	    public static void main(String args[]) {
	    	Encherisseur encherisseur1 = new Encherisseur("Minko", "Arnaud",20000, "in");
	    	System.out.println(encherisseur1.etat);
	    }
	    
	    
}
