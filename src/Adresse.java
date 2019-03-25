
public class Adresse {
	 int num;
	 String nomRue,ville;
	 double codePostal;
	public Adresse(int num,String nomRue,String ville,double codePostal)
	{
		this.num=num;
		this.nomRue=nomRue;
		this.ville=ville;
		this.codePostal=codePostal;
	}
public void setNum(int num)
   {
	this.num=num;
   }
public void setNomRue(String nomRue)
   {
	this.nomRue=nomRue;
   }
public void setVille(String ville)
   {
	this.ville=ville;
   }
public void setCodePostal(double codePostal)
   {
	this.codePostal=codePostal;
   }
public int getNum()
   {
	return num;
   }
public String getNomRue()
   {
	return nomRue;
   }
public String getVille()
   {
	return ville;
   }
public double getCodePostal()
   {
	return codePostal;
   }
public void afficher()
   {
	System.out.println("l'adresse est: "+num+","+nomRue+","+codePostal+","+ville+".");
   }
}
 