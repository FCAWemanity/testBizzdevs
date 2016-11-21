package testBizzdevs;

public class Personne {
	private String nom; 
	private String prenom; 
	private int age; 
	
	public Personne(){
		nom = ""; 
		prenom = "";
		age = 0; 
	}
	
	public Personne(String nom, String prenom, int age){
		this.nom = nom; 
		this.prenom = prenom; 
		this.age = age; 
	}
	
	public void Bonjour(){
		if( age > 35 ){
			System.out.println("Bonjour, je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans.");
		}
		else{
			System.out.println("Wesh magl, mon tag c " + prenom + " " + nom +". J'ai " + age + " piges tmtc");
		}
	}
	
	public void AuRevoir(){
		if( age > 35 ){
			System.out.println("Au plaisir de vous revoir :-).");
		}
		else{
			System.out.println("Ça fait plaiz la mifa d't'avoir vu, sisi à toutes ma gueule");
		}
	}
	
	public void Seduire(){
		if( age > 35 ){
			System.out.println("Vos yeux sont tels des étoiles illuminant cette soirée.");
		}
		else{
			System.out.println("Ton père c'est un voleur mamzelle, il a pris les étoiles et il les a mises dans tes yeux wesh.");
		}
	}

	public static void main(String[] argv){
		Personne racaille = new Personne("Dupuis", "Kévin", 15); 
		Personne gentleman = new Personne("Clooney", "Georges", 42); 
		
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
