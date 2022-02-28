package Pack;

import java.util.Scanner;
import java.util.Vector;



public class Ligne {
	
	
	//attributs static permettant de sauvegarder le num la ligne en dependance du moyen de transport 
	
	private static int codetrain;
	private static int codetram;
	private static int codebus;
	private static int codemetro;
	
	
	private String numl;
	private Station stationDep;
    private Station stationArv;
	MoyTransport moyen;
	private  Vector<Station> statint;
    private Vector<Troncon> troncon;
    private Vector <Navette> navette;
    
	private int nbs;
	private int nbt;
	private int nbn;
	
	//constructeur qui reçoit en entrée le moyen de transport et construit le num de la ligne sous la forme TR001 B002...ect
	public Ligne() {}
	
	public Ligne(MoyTransport moy) {
		this.moyen=moy;
	    MoyTransport.Moyen m=moyen.getmoy();
	    
	  //allouer les differentes collections utilisées dans cette classe
	    
		this.statint=new Vector<Station>();  
	    this.troncon=new Vector<Troncon>();
	    this.navette=new  Vector<Navette>();
	    
	    //on doit d'abord sauvegarder le moyen de transport dans une chaine de car et tester a chaque fois qu'on crée 
	    //une ligne le moyen corespondant pour lui affecter le code unique 
	    
		String ch=m.name();
		switch(ch) {
		case "train":{
			Ligne.codetrain++;  //incrementer a chaque fois qu'on crée une ligne du moyen correspondant pour respecter le numunique
	//on utilise la methode string.format() qui permet de rendre le numunique de la ligne(tout depend le moyen) sous 3chiffres (%03d) et le concatener au code TR,B,T,M
			
			this.numl="TR"+String.format("%03d",Ligne.codetrain); break;
		}
		case "tramway":{
			Ligne.codetram++;
			this.numl="T"+String.format("%03d",Ligne.codetram); break;
		}
		case "metro":{
			Ligne.codemetro++;
			this.numl="M"+String.format("%03d",Ligne.codemetro);	break;
		}
		case "bus":{
			Ligne.codebus++;
			this.numl="B"+String.format("%03d",Ligne.codebus); break;	
		}
		}
	}
	
	
	
	public Ligne(String num,Station dep,Station arv,Vector<Station> statint,Vector<Troncon> troncon,MoyTransport moyen) {
		this.numl=num;
		stationDep=new Station(dep);
		stationArv=new Station(arv);
		this.moyen=moyen;
		this.statint=statint;
		this.troncon=troncon;
	}
	
	//methode tostring pour renvoyer la breve description de la ligne
	
	public String toString() { 
		return "le num de la ligne: "+numl+"\tle moyen:"+moyen+"\t"+"station depart:"+stationDep.getnom()+"\t"+"station arrivee:"+stationArv.getnom() ;
	}   
	
	//methode saisir qui permet a l'utilisateur de crée la ligne en donnant la station depart , arrivées et les diferentes 
	//stations intermediaires , navettes , les troncons serait crée automtiquement
	
	public void saisirl( ) {
		 Scanner e =new Scanner(System.in);
		    Troncon t; Station s;Navette nav;
	        
			System.out.print("\nDonner la station depart de la ligne :");
			stationDep=new Station();  stationDep.saisirs(); stationDep.setligne(this); //la ligne de correspondance
			System.out.print("Donner la station arrivée de la ligne: ");
			stationArv=new Station(); stationArv.saisirs(); stationArv.setligne(this);
			System.out.print("Donner le nombre de stations intermediaires:");
			 nbs=e.nextInt(); //nbs nombre de stations intermediaires
			 
			 //crée la collection de station qui commence par la station debut puis les stations intermediaires et enfin station arrivees
			 
			 statint.add(0,stationDep); //l'ajout de la 1ere station d'abord 
			 
			 //puis le reste des stations
			 
			 for(int i=1;i<=nbs;i++) {
				 s=new Station(); s.saisirs(); s.setligne(this);
		   		  statint.add(s);
			 }
			 statint.add(nbs+1,stationArv);  //l'ajout de la station arrivee en dernier dans la collection 
	       
			nbt=nbs+1; //nombre de troncon = nombre de station -1 donc(nbs nombre de station intermediaires +station dep +station arriv-1)
			System.out.print("\ncette ligne contient :"+nbt +"tronçons.");
			
			//creation de la collection de troncon qui commence a partir de la stations depart jusqu'a arrivee a la station arrivee
			//les stations interm sont des stations fin dans le troncon precedents et debut dans le troncon qui s'en suit
			
			  for(int i=0; i<nbt;i++) {
				 t=new Troncon();  t.saisirt(statint.get(i), statint.get(i+1)); 
				 troncon.add(i, t);		    	
			     }
			  
			    System.out.println("Donner le nombre de navettes:");
		      nbn=e.nextInt(); //nombre de navette
	    	  for(int i=0;i<nbn;i++) {
	    		  nav=new Navette(); nav.saisirn(); nav.setligne(this);
	    		  navette.add(i,nav);
	    	  }
		    
		    
	}
	 //affichage en detaill de la classe ligne 
	
	 public void laffiche() {
		 System.out.println("\n");
		 System.out.println("\n -le numero de cette ligne est :"+numl);
		 System.out.println("\n -la station depart de cette ligne est : "+stationDep.toString());
		 System.out.println("\n-les stations intermediaires de cette ligne sont:");
		 for(int i=1;i<=statint.size();i++) {
			
			 System.out.print("\n"+"     "+i+"-"+statint.get(i-1).toString());
		 }
		 System.out.println("\n\n-la station arrivée de cette ligne est : "+stationArv.toString());
		 System.out.print("\n-les troncons  de cette ligne sont:");
		 for(int i=1;i<=troncon.size();i++) {
			 
			 System.out.print("\n"+"     "+i+"-"+troncon.get(i-1).toString());
		 }
		 System.out.println("\n\n-les navettes  de cette ligne sont:");
		 for(int i=1;i<=navette.size();i++) {
			 
			 System.out.print("\n"+"     "+i+"-"+navette.get(i-1).toString());
		 }
	 }
	 
	//getters
	 
	public String getnuml() { return numl;}
	public Station getstatdepart() { return stationDep;}
	public Station getstatarrivee() { return stationArv;}
	public Vector<Station> getstatint() { return statint;}
	public Vector<Troncon> gettroncon() { return troncon;}
	public Vector<Navette> getnavette() { return navette;}
	public MoyTransport getmoy() { return moyen;}
	
	
	public void setstatdepart(Station statdepart) { this.stationDep = statdepart;}
	public void setstatarrivee(Station statarrivee) { this.stationArv = statarrivee;}
	public void setTroncon(Vector<Troncon> tron){ this.troncon=tron;}
	public void setstatint(Vector<Station> statint){ this.statint=statint;}
	public void setnav(Vector<Navette> nav){ this.navette=nav;}
	
	public void seligne(Ligne l) {
		
		this.moyen=l.moyen;
		this.stationDep=l.stationDep;
		this.stationArv=l.stationArv;
		this.numl=l.numl;
		this.statint=l.statint;
		this.troncon=l.troncon;
		this.navette=l.navette;
		
	}
//affichage du chemin pour aller d'une ligne 
	public void chemin() {
		if(troncon.get(0).getstatdebut().gettype().equals("principale")) {
			System.out.print("\n-"+troncon.get(0).getstatdebut().getnom()+" *principale* ");
		}
		else {
			System.out.print("\n-"+troncon.get(0).getstatdebut().getnom());
		 }
		
		for(int i=0;i<troncon.size();i++) {
			
		  if(troncon.get(i).getstatfin().gettype().equals("principale")) {
			 System.out.print("\t-"+troncon.get(i).getstatfin().getnom()+" *principale* ");
		   }
		  else {
		  	 System.out.print("\t-"+troncon.get(i).getstatfin().getnom());
		   }
		}
	 }
	
	//methode qui permet d'ajouter une station dans une ligne en donnant la pos ou on veux ajouter
	//on teste d'abord si ce n'est pas la station depart ou arriver 
	//si on desire ajouter au depart ou a la fin on doit mettre a jour les stations depart et arrivée
	
	public void addstat(Station s,int pos) {
		if(pos==1) {
			statint.add(pos-1,s);
			Station st=new Station(s);
			stationDep=st;
		 }
		else {
			if(pos==statint.size()+1) {
				statint.add(statint.size(),s);
				Station st=new Station(s);
				stationArv=st;
				
			}
			else {
				statint.add(pos-1,s);
			    }
		 }
	  }
	
	//l'ajout d'une station siginfie l'ajout d'un troncon si c'est une station depart ou fin
	//et l'ajout de deux troncon si c une station intermediaire
	
	public void addtroncon(Station s , int pos)
	{ 
	   Troncon t=new Troncon(); 
	 if(pos==1) {
		t.saisirt(s, statint.get(1));
		troncon.add(0, t);
		
	  }
	 else {
		 if(pos==statint.size()) {
			 t.saisirt(statint.get(statint.size()-2),s); 
				troncon.add(t);
			}
		 else { 
			     int cpt=0;
			    for(int i=0;i<troncon.size();i++) {
				  
				  if(troncon.get(i).getstatdebut()==statint.get(pos-2)) {
					  //troncon.get(i).setstatfin(s);  
					  t.saisirt(troncon.get(i).getstatdebut(),s); 
					  troncon.get(i).settroncon(t);
					  System.out.print("\nremplissez le  troncon à ajoutée:");
					  t.saisirt( s,statint.get(pos));
						 troncon.add(i+1, t); cpt++; break;
				  }  
			   }   
		   }
	    }
       }
		
		
	   //methode qui permet de modifier une station dans une ligne telque si on modifie une station on doit la modifier dans le troncon correspondant
	
	public void setstation(Station nouv,String nom) {
		 if(stationDep.getnom().equals(nom)) {
			stationDep.setstation(nouv);
		   }
		else {
			if(stationArv.getnom().equals(nom)) {
				stationArv.setstation(nouv);
			}
			else {
				for(int i=1;i<statint.size()-1;i++) {
					 
				  if((statint.get(i).getnom()).equals(nom)) {
				  statint.get(i).setstation(nouv);
		          }
					 
			     }
			}
		}
		 
		  for(int i=0;i<=troncon.size()-1;i++) {
			 if(stationDep.getnom().equals(nom)){
				 troncon.get(0).getstatdebut().setstation(nouv);
			 }
			 else {
				 if(stationArv.getnom().equals(nom)) {
					 troncon.get(troncon.size()-1).getstatfin().setstation(nouv);
				  }
				 else { 
					 if((troncon.get(i).getstatfin().getnom().equals(nom)))  {
					  troncon.get(i).getstatfin().setstation(nouv);
					  troncon.get(i+1).getstatdebut().setstation(nouv);
				 }	 
				 }
			 }
		 }
	  }
	
	//methode permet de supprimer une station dans une  ligne  , si on supprime la station depart ou arrivee on devrait mettre a jour
	
	  public void removestat(String nom) {
		  
		  if(nom.equals(stationDep.getnom())) {
			  stationDep=statint.get(1);
			  statint.remove(0);
		  }
		  else {
			  if(nom.equals(stationArv.getnom())) {
				  stationArv=statint.get(statint.size()-1);
				  statint.remove(statint.size()-1);
			  }
			  else {
				  for(int i=1;i<statint.size();i++) {
					  
						 if(statint.get(i).getnom().equals(nom)){
							 statint.remove(statint.get(i));
						 }
			  }
		    }
		  }
	    }
	  
	  
//la suppression d'une station signifie la suppression du troncon debut /fin si le la station supprimer est une station depart /arrivee 
//si on suprrime une station intermediaire on devrait fusionner les deux troncon qui contienne la station en question comme station en commun  
		
	 public void fusionnertronc(String s)
	  {
		 
		 if(troncon.get(0).getstatdebut().getnom().equals(s)) {
				troncon.remove(0);
			}
		 else {
			 if(troncon.get(troncon.size()-1).getstatfin().getnom().equals(s)) {
					//stationArv=troncon.get(troncon.size()-1).getstatdebut();
					troncon.remove(troncon.size()-1);
				}
			 else {
				 for(int i=0;i<troncon.size();i++) {
						if((troncon.get(i).getstatfin().getnom().equals(s))) {
							troncon.get(i).fusionner(troncon.get(i+1));
							//troncon.remove(i+1); 
							troncon.remove(i+1);
					  }
		          }
			   } 
		      }
	       }
	//ajouter une navette dans une ligne
		public void addnavet(Navette n) {
			Navette nav=n;
			navette.add(nav);
		}
		
		//supprimer une navette dans une ligne
		public void removenavet(String marque) {
			 for(int i=0;i<navette.size();i++) {
				 if(navette.get(i).getmarque().equals(marque)){
					 navette.remove(navette.get(i));
				 }
			 }
		}
		
		//modifier une navette dans une ligne
		
		public void setnavette(Navette n,String marque)
		{    for(int i=0;i<navette.size();i++) {
            if(navette.get(i).getmarque().equals(marque)) {
			 	navette.get(i).setnavette(n);
			 }
		   }
	   }
		
	//methode calcul durée d'un point A a un point B  on cherche d'abord la station du pointA dans le troncon puis on calcule la durée tout depend la vitesse du moyen
	//de transport et son etat grace a la methode calculdurre lde la classe tronocn  jusqu'a y arriver au pointB  
		public double calculduree(Station d,Station f) {
			int i=0; double duree = 0;
			while(!this.troncon.get(i).getstatdebut().equals(d)) {
				i++;
			}
		
			int j=i;
			while(!troncon.get(j).getstatfin().equals(f)) {
				duree=duree+troncon.get(j).calculduree(moyen.getmoy());
				j++;
			}
			duree=duree+troncon.get(j).calculduree(moyen.getmoy());
			return duree;
		}
		
	

	
	
}
