package testBizzdevs;

public class Personne{

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
