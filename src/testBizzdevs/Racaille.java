package testBizzdevs;

public class Racaille extends Personne implements IPersonne{ 
	
	public Racaille(String nom, String prenom, int age){
		super(nom, prenom, age);
	}
	
	@Override
	public String Bonjour() {
		return "Wesh magl, mon tag c " + GetPrenom() + " " + GetNom() +". J'ai " + GetAge() + " piges tmtc";
	}

	@Override
	public String AuRevoir() {
		return "Ça fait plaiz la mifa d't'avoir vu, sisi à toutes ma gueule";		
	}

	@Override
	public String Seduire() {
		return "Ton père c'est un voleur mamzelle, il a pris les étoiles et il les a mises dans tes yeux wesh.";		
	}

}
