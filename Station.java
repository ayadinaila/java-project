package Pack;

import java.util.Scanner;
import java.util.Vector;

public class Station {

	//les attributs 
	
	private int nums;
	private String noms;
	private String type;
	private double longitude;
	private double lattitude;
	private Ligne l;
	
	//les differents constructeurs 
	
	public Station(Ligne l) {
		this.l=l;
	}
	public Station() {}    //constructeur vide
	
	
	public Station(Station stat)
    {
        this.nums=stat.nums;
        this.noms=stat.noms;
        this.type=stat.type;
        this.longitude=stat.longitude;
        this.lattitude=stat.lattitude;
        this.l=stat.l;
    }
	
	
	public Station(int num,String nom,String type,double longitude,double lattitude, Ligne l ) {
		this.noms=nom;
		this.nums=num; 
		this.type=type;
		this.longitude=longitude;
		this.lattitude=lattitude;
		this.l=l;
		
	}
	
	//affichage de la description de la classe station via la methode toString
 @Override
	public String toString() { 
		return "\t-"+"le nom: "+noms+"\t-"+"le num: "+nums+"\t-"+"le type:"+type +"\t-"+l.getnuml();
	}
 
	//methode qui permet a l'utilisateur de saisir les données concernant la station crée
	public void saisirs(){
		 Scanner e =new Scanner(System.in);
		 System.out.println("\nDonner le num de la station : ");
		 this.nums=e.nextInt();  
			
		System.out.println("Donner le nom de la station : ");
		this.noms=e.next().toLowerCase();
		
		
		System.out.println("Donner le type de station principale ou secondaire: ");
		this.type=e.next().toLowerCase();
		
		System.out.println("Donner la longitude de la station:");
		this.longitude=e.nextDouble();
		
		System.out.println("Donner lattitude de la station:");
		this.lattitude=e.nextDouble();
	}

//methode qui affiche en detail les different attributs de la station
	
	public void saffiche() {
		System.out.println("la station appartient a la ligne: "+l.getnuml());
		System.out.println("numero de station: "+nums);
		System.out.println("nom de station: "+noms);
		System.out.println("type de la  station: "+type);
		System.out.println("longitude de la station: "+longitude);
		System.out.println("lattitude de la station: "+lattitude);
	
	
	}
	
 //getters
	
	public int getnum() { return nums;}
	public String gettype() { return type;}
	public String getnom() { return noms;}
	public double getlon() { return longitude;}
	public double getlat() { return lattitude;}
	public Ligne getligne() { return l;}
	
	//methode qui modifie toute la station en donnant en par la nouvelle station
	
	public void setstation(Station stat)
	{
		this.nums=stat.nums;
		this.noms=stat.noms;
		this.type=stat.type;
		this.longitude=stat.longitude;
		this.lattitude=stat.lattitude;
		this.l=stat.l;
		
	}
	
	//setters
	public void setnom(String nom) {this.noms=nom;}
	public void setnum(int num) {this.nums=num;}
	public void setype(String type) {this.type=type;}
	public void setlong(double  longi) {this.longitude=longi;}
	public void setlat(double lat) {this.lattitude=lat;}
	public void setligne(Ligne l) { this.l=l;}
	
	
	//methode qui verifie si deux stations sont equivalentes
	
	public boolean equals(Station s2) {
		
		if((this.longitude==s2.longitude) && (this.lattitude==s2.lattitude))
				{ return true;
				
				}
		else { 
			return false;
		}
		}
	
	
	  public void statollect(Vector <Station> station) {
    	  System.out.println("\n");
    	  for(int i=0;i<station.size();i++) {
    		  
    		  System.out.println(station.get(i).toString());
    	  }
    	  
      }
    
	
	
	
	
	
	
	
	
	
	
	
	
}
