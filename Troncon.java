package Pack;

import java.util.Scanner;
import java.util.Vector;

public class Troncon {
	
	//attributs
	
	private int numt;
	private Station stationD;
	private Station stationF;
	private float kilom;
	private String etat;
	
	//les constructeurs de la classe
	
	public Troncon() {}  //constructeur vide
	
	public Troncon(int numt,Station debut,Station fin,float kilom,String etat) {
		this.numt=numt;
		this.stationD=debut;
		this.stationF=fin;
		this.etat=etat;
		this.kilom=kilom;
		
	}
	//affichage de la description breve du troncon 
	
	public String toString() {
		return "\t"+stationD.getnom()+"\t-"+stationF.getnom()+"\t-"+kilom+"\t"+etat +"\t"+numt;
	}
	
	//methode permettant de saisir les données sur un troncon 
	public void saisirt(Station debut,Station fin) {
		 Scanner e =new Scanner(System.in);
		 
			
		 System.out.println("\nDonner le num du troncon: ");
		    numt=e.nextInt();
			
			String ch;
			do{
				System.out.println("Donner l'etat du tronçon bon ,moyen ou degrade? : ");
				ch=e.next().toLowerCase();
			}while(!ch.equals("bon") && !ch.equals("moyen") && !ch.equals("degrade"));
			this.etat=ch;
			
			System.out.println("Donner le kilometrage du tronçon: ");
			this.kilom=e.nextFloat(); 
			
			//station debut
			
			stationD=new Station(); stationD.setstation(debut);;
			
			//station fin
		    stationF=new Station(); stationF.setstation(fin);
	}
	
	// affichage en detail des troncon 
	public void taffiche() {
        System.out.println("la ligne d'appartenance de ce troncon: "+stationD.getligne().getnuml());
		System.out.println("le numero du tronçon:"+numt);
		System.out.println("la station debut du tronçon :"+stationD.getnom());
		System.out.println("la station fin  du tronçon :"+stationF.getnom());
		System.out.println("etat du tronçon:"+etat);
		System.out.println("le kilometrage du tronçon :"+kilom+"km");
	}
	
	//getters
	
	public int getnumt() { return numt;}
	public float getkilom() { return kilom;}
	public String getetat() { return etat;}
	public Station getstatdebut() { return stationD;}
	public Station getstatfin() { return stationF;}
	
	//setters
	
	public void setnumt(int num) { numt=num;}
	public void setkilom(float kim) {  kilom=kim;}
	public void setetat(String etat) { this.etat=etat;}
	public void setstatdebut(Station d) { stationD=d;}
	public void setstatfin(Station f) {  stationF=f;}
	
	//methode permettant de modifier tout un troncon
	public void settroncon(Troncon t)
	{
		this.etat=t.etat;
		this.kilom=t.kilom;
		this.numt=t.numt;
		this.stationD=t.stationD;
	    this.stationF=t.stationF;
		
	} 
	//tester si deux troncon sont equivalents
	
	public boolean equals(Troncon t) {
		
		if((this.stationD.equals(t.stationD))&&(this.stationF.equals(t.stationF))&&(this.kilom==t.kilom)) {
		
			return true;
	}
	
		else  return false;
}
	
	
	//methode qui permet de fusionner deux troncon consecutif pour en avoir un seul en changeant la station fin du troncon precedent 
	//par la station fin du troncon suivant
	
	public  void  fusionner(Troncon t) {
		
		 if((this.stationF.getnom()==t.stationD.getnom())) {
			 
			this.setstatfin(t.stationF);
			this.kilom=this.kilom+t.kilom;
    
			if((!this.etat.equals(t.etat))) {
				if((this.etat=="bon")&&(t.etat=="moyen")||(t.etat=="bon")&&(this.etat=="moyen") ) {
					this.etat="bon";
				}
				else {
					this.etat="moyen";
				}
			}
		 }
		 
		 else {
			 if((t.stationF.getnom()==this.stationD.getnom())) {
					t.setstatfin(this.stationF);
					t.kilom=t.kilom+t.kilom;
					if((!this.etat.equals(t.etat))) {
						
						if((this.etat=="bon")&&(t.etat=="moyen")) {
							this.etat="bon";
						}
						else {
							this.etat="moyen";
						}
					 }
				 }	
		    }
	  }
	
	
	  public void troncollect(Vector <Troncon> troncon) {
    	  System.out.println("\n");
    	  for(int i=0;i<troncon.size();i++) {
    		  
    		  System.out.println(troncon.get(i).toString());
    	  }
    	  
      }
    
	
	
	
	
	
	
	
	
	
	
	
	
	//methode permettant de calculer la durée estimée pour se deplacer d'un point a un autre on donnant une vitesse constante tout depend
	//l'etat et le  moyen de transport et calculé la durrée en retournant une durée en minutes
	
	public double calculduree(MoyTransport.Moyen m) {
        String ch=m.name(); float v=0 ; double d;
         switch (ch)
            {
                case "train":  {

                    if(this.etat.equals("bon")) {    v=160;}
                    else {
                     if(this.etat.equals("moyen")) {
                         v=120;
                     }
                     else {
                         v=100;
                     }
                    }  break; }

                case "bus":    {

                    if(this.etat.equals("bon")) {    v=70;}
                    else {
                     if(this.etat.equals("moyen")) {
                         v=60;
                     }
                     else {
                         v=40;
                     }
                    }  break;  }

                case "tramway":{

                    if(this.etat.equals("bon")) {    v=50;}
                    else {
                     if(this.etat.equals("moyen")) {
                         v=40;
                     }
                     else {
                         v=20;
                     }
                    }  break; }


                case "metro" : {
                    if(this.etat.equals("bon")) {    v=100;}
                else {
                     if(this.etat.equals("moyen")) {
                         v=120;
                     }
                     else {
                         v=150;
                     }
                    }  break;}
             }
         d=(this.kilom/v)*60;
       
               return d;
         }
	
	
	

}
