package Pack;

import java.util.Scanner;
import java.util.Vector;

public class Navette {
	
	//attributs 
	
	private  int numunique;
	private String marque;
	private int annee;
	private Ligne l;
	
	//les constructeurs
	
	 public Navette(){}

	 public Navette (int num_unique,String marque,int annee,Ligne l){
	       this.numunique=num_unique;
	       this.marque=marque; 
	       this.annee=annee;
	       this.l=l;
	   }
	
	 //affichage de la description de la classe 
	 
	public String toString() {
		return "\t-"+"le numero de la navette:"+this.numunique+"\t-"+"la marque:"+"\t"+this.marque+"\t-"+"l'annee:"+this.annee;
	}
	
	//methode permet de saisir les inos sur la navette
	
	public void saisirn() {
		Scanner e=new Scanner(System.in);
		System.out.println("donner le num de la navette:");
		this.numunique=e.nextInt();
		
		System.out.print("\ndonner la marque de la navette:");
		this.marque=e.next();
		
		System.out.print("\ndonner l'annee de circulation de la navette:");
		this.annee=e.nextInt();
		
	}
	//affichage en detail 
	
	public void affiche() {
		
		System.out.print("\n-le num de la navette:"+this.numunique);
		System.out.print("\n-la marque de la navette:"+this.marque);
		System.out.print("\n-l'annee de circulation de la navette"+this.annee);
		System.out.print("\n-la navette appartient a la ligne "+this.l);
		
	}
	//getters
	
	  public int getnum(){ return numunique; }
	  public String getmarque(){ return marque; }
	  public int getannee(){return annee;}
	  public Ligne getl(){return l;}
	
	//setters
	  
	  public void setnum(int num) { this.numunique = num; }
      public void setmarque(String marque) {this.marque = marque; }
      public void setannee(int annee) { this.annee = annee; }
      public void setligne(Ligne l) { this.l = l; }
	
     //modifier toute une navette
      
      public void setnavette(Navette n)
  	{
  		this.annee=n.numunique;
  		this.l=n.l;
  		this.marque=n.marque;
  		this.numunique=n.numunique;
  		
  	} 
	
      public static void navcollect(Vector <Navette> navette) {
    	  System.out.println("\n");
    	  for(int i=0;i<navette.size();i++) {
    		  
    		  System.out.println(navette.get(i).toString());
    	  }
    	  
      }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
