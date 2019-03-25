import java.util.*;
public class Programme {
	public static void main(String[] args) {
	int k=0;
	String v;
	Scanner sc=new Scanner(System.in);
	System.out.println("Donner le nom de la ville souhaitée: ");
	v=sc.next();
	Citoyen[] c= {new Citoyen("ayad","abdou",new Adresse(40,"benDjaida","BordjElBahri",16013))};
    while(k<1 )
    {
    	if(c[k].adresse.ville==v) 
    	{
         c[k].afficherCit();
    	}
    }
}
}

