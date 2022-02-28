package Pack;

import java.util.Scanner;

public class MoyTransport {
	
       //creation d'une enumation comportant les differents moyen de transport 
	
		public static enum  Moyen { metro(),tramway(),bus(),train();}
		
		//attributs
		
		private int nb;
		private int heureD;
		private int heureF;
		private Moyen m;
		
		//constructeurs
		
		 public MoyTransport(Moyen m){ this.m=m;}
		
		public MoyTransport(Moyen m,int nb , int hb,int hf) {
			this.nb=nb; this.heureD=hb; this.heureF=hf; this.m=m;}
		
		//affichage des details concernant le moyen de transport 
		
		 @Override
	     public String toString() {
	    	 return m.name()+"\t-"+nb+"\t-"+heureD+"\t-"+heureF;
	     }
		  
		
		  //affichage en detail 
		  public void maffiche() {
			  
			  System.out.println(" le moyen de transport:"+m.name());
			  System.out.println(" le nombre de voyageurs:"+this.nb);
			  System.out.println(" l'heure de debut:"+this.heureD);
			  System.out.println(" l'heure de fin:"+this.heureF);
			  
		  }
		  
		  //getters
		  
		  public Moyen getmoy() { return m;}
		  public int getnb() { return nb;}
		  public int gethb() { return heureD;}
		  public int gethf() { return heureF;}
		  
		  //setters
		  
		  public void setmoy(Moyen m) { this.m=m;}
		  public void setnb(int nb) { this.nb=nb;}
		  public void sethb(int hb) { this.heureD=hb;}
		  public void sethf(int hf) { this.heureF=hf;}
		  
		  //saisir les données concernant le moyen de transport
		  
		  public void sasimoy() {
			  
			  System.out.println("\ndonner le nombre de  voyageurs moyen dans la journée du"+m.name()+":");
			  Scanner e=new Scanner(System.in);
			  
			  this.nb=e.nextInt();
			  
			  System.out.println("donner l'heure de debut du"+m.name()+":");
			  this.heureD=e.nextInt();
			  
			  System.out.println("donner l'heure de fin du"+m.name()+":");
			  this.heureF=e.nextInt();
			  
			  
		  }
}
