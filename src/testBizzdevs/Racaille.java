package testBizzdevs;

public class Racaille implements IPersonne{
	
	private String nom; 
	private String prenom; 
	private int age; 
	
	public Racaille(String nom, String prenom, int age){
		this.nom = nom; 
		this.prenom = prenom; 
		this.age = age; 
	}
	
	@Override
	public void Bonjour() {
		System.out.println("Wesh magl, mon tag c " + prenom + " " + nom +". J'ai " + age + " piges tmtc");
	}

	@Override
	public void AuRevoir() {
		System.out.println("Ça fait plaiz la mifa d't'avoir vu, sisi à toutes ma gueule");		
	}

	@Override
	public void Seduire() {
		System.out.println("Ton père c'est un voleur mamzelle, il a pris les étoiles et il les a mises dans tes yeux wesh.");		
	}

}
