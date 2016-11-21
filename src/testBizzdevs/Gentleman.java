package testBizzdevs;

public class Gentleman extends Personne implements IPersonne {
	
	public Gentleman(String nom, String prenom, int age){
		super(nom, prenom, age);
	}
	
	@Override
	public void Bonjour() {
		System.out.println("Bonjour, je m'appelle " + GetPrenom() + " " + GetNom() + " et j'ai " + GetAge() + " ans.");		
	}

	@Override
	public void AuRevoir() {
		System.out.println("Au plaisir de vous revoir :-).");
	}

	@Override
	public void Seduire() {
		System.out.println("Vos yeux sont tels des étoiles illuminant cette soirée.");		
	}

}
