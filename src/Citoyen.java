
public class Citoyen {
	String nom,prenom;
	Adresse adresse;
	public Citoyen(String nom,String prenom,Adresse adresse)
	{
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
	}
	public void afficherCit()
	{
		System.out.println("le citoyen est: "+nom+" "+prenom+"son adresse: "+adresse);
	}
}
