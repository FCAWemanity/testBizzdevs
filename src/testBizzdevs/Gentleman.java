package testBizzdevs;

public class Gentleman extends Personne implements IPersonne {
	
	public Gentleman(String nom, String prenom, int age){
		super(nom, prenom, age);
	}
	
	@Override
	public String Bonjour() {
		return "Bonjour, je m'appelle " + GetPrenom() + " " + GetNom() + " et j'ai " + GetAge() + " ans.";		
	}

	@Override
	public String AuRevoir() {
		return "Au plaisir de vous revoir :-).";
	}

	@Override
	public String Seduire() {
		return "Vos yeux sont tels des étoiles illuminant cette soirée.";		
	}

}
