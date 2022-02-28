package Pack;

import java.util.Vector;


public class Remplissage {
	
	  static Vector <Ligne> ligne=new Vector <Ligne> ();
	  
	 
	  
	public static Ligne lignetram1() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport tram =new MoyTransport(MoyTransport.Moyen.tramway,28500, 06,22);
		   Ligne l=new Ligne(tram);
		  
		    Station s1 = new Station(1,"ruisseau","principale",35.35578,3.96244 ,l);
		    Station s2= new Station(2,"lesfusillés","secondaire",35.35421,3.915554 ,l);
		    Station s3= new Station(3,"hamadache","secondaire",35.365418,3.92244 ,l);
		    Station s4 = new Station(4,"maqqaria","secondaire",35.305678,3.93244 ,l);
		    Station s5 = new Station(5,"caroubier","principale",35.305678,3.93244 ,l);
		    Station s6 = new Station(6,"laglacière","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(125,"elharach","secondaire",35.305678,3.93244 ,l);
		    Station s8 = new Station(8,"bellevue","secondaire",35.305678,3.93244 ,l);
		    Station s9 = new Station(9,"babezzouar","secondaire",35.305678,3.93244 ,l);
		    Station s10 = new Station(10,"bordjelkiffan","principale",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		    station.add(s8);
		    station.add(s9);
		    station.add(s10);

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,3.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,3,"moyen");
		    Troncon t4 = new Troncon(4,s4,s5,2.8f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,1.5f,"moyen");
		    Troncon t6 = new Troncon(6,s6,s7,2,"moyen");
		    Troncon t7 = new Troncon(7,s7,s8,5.5f,"bon");
		    Troncon t8 = new Troncon(8,s8,s9,5,"degrade");
		    Troncon t9 = new Troncon(9,s9,s10,1.6f,"moyen");
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		    troncon.add(t7);
		    troncon.add(t8);
		    troncon.add(t9);
		    
		    Navette n1=new Navette(170,"AltsomCitadis",2011, l);
		    Navette n2=new Navette(100,"Setram",2011, l);
		    navette.add(n1);
		    navette.add(n2);
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s10);
		
		return l;
		
	}
	
	public static Ligne lignetram2() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport tram =new MoyTransport(MoyTransport.Moyen.tramway,25000, 06,22);
		   Ligne l=new Ligne(tram);
		  
		    Station s1 = new Station(223,"esenia_oran","principale",35.35578,3.96244 ,l);
		    Station s2= new Station(224,"esenia_sud","secondaire",38.35421,3.915554 ,l);
		    Station s3= new Station(225,"abdelkader","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(226,"lespalmiers","secondaire",35.345678,3.93244 ,l);
		    Station s5 = new Station(227,"othmania","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(228,"enset","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(229,"lycée_elbadr","principale",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		   

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,3.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,3,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,5.3f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,2,"moyen");
		    Troncon t6 = new Troncon(6,s6,s7,2,"moyen");
	
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		   
		    Navette n1=new Navette(142,"AltsomCitadis",2013, l);
		    Navette n2=new Navette(90,"Setram",2011, l);
		    navette.add(n1);
		    navette.add(n2);
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s7);
		
		return l;
		
	}
	
	public static Ligne lignemetro1() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport metro=new MoyTransport(MoyTransport.Moyen.metro,27000, 06,22);
		   Ligne l=new Ligne(metro);
		  
		   
		    Station s1 = new Station(150,"elharrachcentre","principale",32.5678,3.96244 ,l);
		    Station s2= new Station(125,"elharach","principale",18.35421,3.915554 ,l);
		    Station s3= new Station(152,"bachdjerrah","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(153,"haielbadr","principale",35.345678,3.93244 ,l);
		    Station s5 = new Station(154,"meret_soleil","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(155,"amirouche","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(156,"lesfusillés","secondaire",35.305678,3.93244 ,l);
		    Station s8 = new Station(157,"jardin_d'essai","secondaire",35.305678,3.93244 ,l);
		    Station s9 = new Station(158,"elhamma","principale",35.305678,3.93244 ,l);
		    Station s10 = new Station(159,"aisset_idir","principale",35.305678,3.93244 ,l);
		    Station s11 = new Station(160,"1ermai","principale",35.305678,3.93244 ,l);
		    Station s12= new Station(161,"tafourah","principale",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		    station.add(s8);
		    station.add(s9);
		    station.add(s10);
		    station.add(s11);
		    station.add(s12);

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,3.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,3,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,5.3f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,6.2f,"bon");
		    Troncon t6 = new Troncon(6,s6,s7,2,"moyen");
		    Troncon t7 = new Troncon(7,s7,s8,2,"bon");
		    Troncon t8 = new Troncon(8,s8,s9,2,"moyen");
		    Troncon t9 = new Troncon(8,s9,s10,2,"moyen");
		    Troncon t10 = new Troncon(8,s10,s11,2,"moyen");
		    Troncon t11 = new Troncon(8,s11,s12,2,"moyen");
	        
		    
		    
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		    troncon.add(t7);
		    troncon.add(t8);
		    troncon.add(t9);
		    troncon.add(t10);
		    troncon.add(t11);
		    
		    Navette n1=new Navette(250,"Etusa",2011, l);
		    Navette n2=new Navette(90,"Toyota",2011, l);
		    navette.add(n1);
		    navette.add(n2);
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s12);
		
		return l;
		
	}
	public static Ligne lignemetro2() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport metro=new MoyTransport(MoyTransport.Moyen.metro,25500, 06,22);
		   Ligne l=new Ligne(metro);
		  
		   
		    Station s1 = new Station(100,"ainnaaja","principale",32.5678,3.96244 ,l);
		    Station s2= new Station(101,"gué_constantine","principale",18.35421,3.915554 ,l);
		    Station s3= new Station(102,"lesateliers","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(153,"hai_elbadr","principale",35.345678,3.93244 ,l);
		    Station s5 = new Station(154,"mer_etsoleil","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(155,"amirouche","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(156,"lesfusillés","secondaire",35.305678,3.93244 ,l);
		    Station s8 = new Station(157,"jardin_d'essai","secondaire",35.305678,3.93244 ,l);
		    Station s9 = new Station(158,"elhamma","principale",35.305678,3.93244 ,l);
		    Station s10 = new Station(159,"aisset_idir","principale",35.305678,3.93244 ,l);
		    Station s11 = new Station(160,"1ermai","principale",35.305678,3.93244 ,l);
		    Station s12= new Station(161,"tafourah","principale",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		    station.add(s8);
		    station.add(s9);
		    station.add(s10);
		    station.add(s11);
		    station.add(s12);

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,3.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,3,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,5.3f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,6.2f,"bon");
		    Troncon t6 = new Troncon(6,s6,s7,2,"moyen");
		    Troncon t7 = new Troncon(7,s7,s8,2,"bon");
		    Troncon t8 = new Troncon(8,s8,s9,2,"moyen");
		    Troncon t9 = new Troncon(8,s9,s10,2,"moyen");
		    Troncon t10 = new Troncon(8,s10,s11,2,"moyen");
		    Troncon t11 = new Troncon(8,s11,s12,2,"moyen");
	        
		    
		    
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		    troncon.add(t7);
		    troncon.add(t8);
		    troncon.add(t9);
		    troncon.add(t10);
		    troncon.add(t11);
		    
		    Navette n1=new Navette(250,"Etusa",2011, l);
		    Navette n2=new Navette(90,"Toyota",2011, l);
		    navette.add(n1);
		    navette.add(n2);
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s12);
		
		return l;
		
	}
	public static Ligne lignebus() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport bus =new MoyTransport(MoyTransport.Moyen.bus,15000, 07,20);
		   Ligne l=new Ligne(bus);
		  
		    Station s1 = new Station(120,"babezzouar","principale",32.5678,3.96244 ,l);
		    Station s2= new Station(121,"5juillet","secondaire",18.35421,3.915554 ,l);
		    Station s3= new Station(122,"elalia","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(123,"citérabia","secondaire",35.345678,3.93244 ,l);
		    Station s5 = new Station(124,"5maisons","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(126,"lavigerie","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(125,"elharach","secondaire",35.305678,3.93244 ,l);
		    Station s8 = new Station(127,"boumati","principale",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		    station.add(s8);
		   

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,3.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,3,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,5.3f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,6.2f,"bon");
		    Troncon t6 = new Troncon(6,s6,s7,2,"moyen");
		    Troncon t7 = new Troncon(7,s7,s8,2,"bon");
		  
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		    troncon.add(t7);
		   
		    
		    Navette n1=new Navette(140,"Toyota",2011, l);
		    navette.add(n1);
		   
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s8);
		
		return l;
		
	}
	

	public static Ligne lignetrain1() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport train1 =new MoyTransport(MoyTransport.Moyen.train,128000, 05,21);
		   Ligne l=new Ligne(train1);
		  
		    Station s1 = new Station(320,"alger","principale",32.5678,3.96244 ,l);
		    Station s2= new Station(321,"agha","secondaire",18.35421,3.915554 ,l);
		    Station s3= new Station(322,"ateliers","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(323,"hocinedey","secondaire",35.345678,3.93244 ,l);
		    Station s5 = new Station(324,"caroubier","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(125,"elharach","secondaire",35.305678,3.93244 ,l);
		    Station s7 = new Station(326,"ainnaaja","secondaire",35.305678,3.93244 ,l);
		    Station s8 = new Station(327,"babaali","secondaire",35.305678,3.93244 ,l);
		    Station s9 = new Station(328,"birtouta","principalee",35.305678,3.93244 ,l);
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		    station.add(s7);
		    station.add(s8);
		    station.add(s9);

		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,4.7f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,5.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,6.8f,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,8.9f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,6.2f,"bon");
		    Troncon t6 = new Troncon(6,s6,s7,3.5f,"moyen");
		    Troncon t7 = new Troncon(7,s7,s8,3,"bon");
		    Troncon t8 = new Troncon(8,s8,s9,4.5f,"moyen");
		    
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		    troncon.add(t6);
		    troncon.add(t7);
		    troncon.add(t8);
		    
		    Navette n1=new Navette(200,"Stadler",2009, l);
		    navette.add(n1);
		   
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s9);
		
		return l;
		
	}
	
	public static Ligne lignetrain2() {
		
		  Vector<Station> station = new Vector<>();
		  Vector<Troncon> troncon = new Vector<>();
		  Vector<Navette> navette = new Vector<>();
		  
		  MoyTransport train1 =new MoyTransport(MoyTransport.Moyen.train,12215, 05,21);
		   Ligne l=new Ligne(train1);
		  
		    Station s1 = new Station(329,"birtouta","principale",32.5678,3.96244 ,l);
		    Station s2= new Station(330,"boufarik","secondaire",18.35421,3.915554 ,l);
		    Station s3= new Station(331,"blida","secondaire",36.365418,3.92244 ,l);
		    Station s4 = new Station(332,"chiffa","secondaire",35.345678,3.93244 ,l);
		    Station s5 = new Station(333,"mouzaia","secondaire",35.305678,3.93244 ,l);
		    Station s6 = new Station(334,"elaffroun","secondaire",35.305678,3.93244 ,l);
		   
		   
		    station.add(s1);
		    station.add(s2);
		    station.add(s3);
		    station.add(s4);
		    station.add(s5);
		    station.add(s6);
		   
		    // creation des troncons
		 
		    Troncon t1 = new Troncon(1,s1,s2,12f,"bon");
		    Troncon t2 = new Troncon(2,s2,s3,4.5f,"bon");
		    Troncon t3 = new Troncon(3,s3,s4,8.9f,"degrade");
		    Troncon t4 = new Troncon(4,s4,s5,5.3f,"bon");
		    Troncon t5 = new Troncon(5,s5,s6,7f,"bon");
		   
		    
		    troncon.add(t1);
		    troncon.add(t2);
		    troncon.add(t3);
		    troncon.add(t4);
		    troncon.add(t5);
		   
		    Navette n1=new Navette(200,"Stadler",2009, l);
		    navette.add(n1);
		   
		    // affectation
		    l.setTroncon(troncon);
		    l.setstatint(station);
		    l.setnav(navette);
		    l.setstatdepart(s1);
		    l.setstatarrivee(s6);
		
		return l;
		
	}
	
	
	public static Vector <Ligne> remplir() {
		Ligne l1=new Ligne(); l1=lignetram1();	
		Ligne l2=new Ligne(); l2=lignetram2();	
		Ligne l3=new Ligne(); l3=lignemetro1();	
		Ligne l4=new Ligne(); l4=lignemetro2();	
		Ligne l5=new Ligne(); l5=lignebus();	
		Ligne l6=new Ligne(); l6=lignetrain1();	
		Ligne l7=new Ligne(); l7=lignetrain2();	
	
		ligne.add(l1);
		ligne.add(l2);
		ligne.add(l3);
		ligne.add(l4);
		ligne.add(l5);
		ligne.add(l6);
		ligne.add(l7);
		
		return ligne;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
