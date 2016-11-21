package testBizzdevs;

public abstract class Personne{

	private String nom; 
	private String prenom; 
	private int age; 
	
	public String GetNom(){
		return nom;
	}
	
	public String GetPrenom(){
		return prenom; 
	}
	
	public int GetAge(){
		return age;
	}
	
	public Personne(String nom, String prenom, int age){
		this.nom = nom; 
		this.prenom = prenom; 
		this.age = age; 
	}
	
	public static void main(String[] argv){
		IPersonne racaille = new Racaille("Dupuis", "Kévin", 15); 
		IPersonne gentleman = new Gentleman("Clooney", "Georges", 42); 
		
		System.out.println("Affichage d'une personne gentleman : ");
		gentleman.Bonjour();
		gentleman.Seduire();
		gentleman.AuRevoir();
		
		System.out.println();
		System.out.println("Affichage d'une personne racaille : ");
		racaille.Bonjour(); 
		racaille.Seduire(); 
		racaille.AuRevoir();
	}
	
}
