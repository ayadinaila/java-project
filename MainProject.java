package Pack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
   
public class MainProject {
	
	
	static Vector <Ligne> donn�es=new Vector <Ligne> (); //collections de ligne qui contient les donn�es predefenis
	static ArrayList <Ligne> introligne=new ArrayList <Ligne> (); //collection de lignes si l'utilsateur souhaite cr�er
	
	//methode permet d'afficher le menu principale
	
	public static int menu1() {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n le Menu Principale !\n");
		System.out.println(" 1- Introduction des donn�es . ");
		System.out.println(" 2- mise � jour  des donn�es . ");
		System.out.println(" 3- Recherches sur les donn�es . ");
		System.out.println(" 4- Affichage des donn�es. ");
		System.out.println(" 5- Quitter le menu . ");
		do {
			System.out.print("\nVeuillez introduire votre choix:");
			c=sc.nextInt();

		}while((c<1)&&(c>4));
				return c;
	   }
	
	//methode permet d'afficher le menu de mise a jour
	
	public static int menumiseajour() {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n le Menu de mise a jour !\n");
		System.out.println(" 1- ajouter. ");
		System.out.println(" 2- modifier. ");
		System.out.println(" 3- supprimer. ");
		System.out.println(" 4- retourner au menu principale  . ");
		do {
			System.out.print("\n Veuillez introduire votre choix:");
			c=sc.nextInt();
          
		}while((c<1)&&(c>4));
		return c;
	}
	
	//menu qui permet  d'afficher les differentes options d'affichage
	
	public static int menuaffichage() {
		
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n le Menu d'affichage !\n");
		System.out.println(" Que voulez vous affichez? \n ");
		System.out.println(" 1- tout les Donn�es. ");
		System.out.println(" 2- une ligne. ");
		System.out.println(" 3- une station. ");
		System.out.println(" 4- un troncon  . ");
		System.out.println(" 5- retourner au menu principale . ");
		do {
			System.out.print("\nVeuillez introduire votre choix:");
			c=sc.nextInt();
          
		}while((c<1)&&(c>5));
		return c;
		
	}
	//menu de recherche sur les requetes 
	
	public static int menurecherche() {
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println(" \n le Menu des Requetes de recherches !\n");
		System.out.println("1- Affichage de toutes les lignes de transport en pr�cisant le moyen de transport, le num�ro de la ligne, la station de d�part et la station d'arriv�e.");
		System.out.println("2- Affichage du chemin sur une ligne donn�e.");
		System.out.println("3- Chercher toutes les lignes qui passent par une station donn�e.");
		System.out.println("4- Affichage des stations de correspondance.");
		System.out.println("5- La ligne emprunt�e par le max ou le min nombre de voyageurs.");
		System.out.println("6- La dur�e estim�e pour aller d'un point A vers un point B.");
		System.out.println("7- Retourner au menu principale . ");
		do {
			System.out.print("\n Veuillez introduire votre choix:");
			c=sc.nextInt();
		}while((c<1)&&(c>7));
		return c;
	}
	
	//option de choix sur quel entit� appliquer la mise a jour
	
	public static int option() {
		int ch;Scanner sc=new Scanner(System.in);
		System.out.println("\nQue  voulez vous mettre � jour?\n");
		System.out.println("1- une ligne"); 
        System.out.println("2- une station");   
        System.out.println("3- une navette"); 
        System.out.println("4- retour au menu de mise a jour "); 
     	   do {
			    System.out.print("\nVeuillez introduire votre choix:");
			    ch=sc.nextInt(); }while((ch<1)&&(ch>4));
     	        return ch;
           }

	//menus pour choisir l'options de modification selon l'entit� choisi
	
	//menu pour modifier une ligne 
	
	public static int modifierstation() {
		int ch;Scanner sc=new Scanner(System.in);
		System.out.println("\nQue  voulez vous modifier dans votre station?\n");
		System.out.println("1- nom de la station"); 
        System.out.println("2- num de la station");   
        System.out.println("3- le type");
        System.out.println("4- toute une station");
        System.out.println("5- retour au menu de mise a jour "); 
     	   do {
			    System.out.print("\nVeuillez introduire votre choix:");
			    ch=sc.nextInt(); }while((ch<1)&&(ch>5));
     	        return ch;
           }
	
	//menu pour modifier une station
	public static int modifierligne() {
		int ch;Scanner sc=new Scanner(System.in);
		System.out.println("\nQue  voulez vous modifier dans la ligne?\n");
		System.out.println("1- station depart"); 
        System.out.println("2- station arriv�e");   
        System.out.println("3- retour au menu de mise a jour "); 
     	   do {
			    System.out.print("\nVeuillez introduire votre choix:");
			    ch=sc.nextInt(); }while((ch<1)&&(ch>3));
     	        return ch;
           }
	
	
	
	
	//menu pour modifier  une navette
	
	
	
	
	
	
	
	
	//methode d'application des choix de l'utilisateur sur l'affichage en appelant des methodes 
	//d'affichage implement� si dessous 
	
	public static void choixaffichage() {
		
		 int ch;Scanner sc=new Scanner(System.in);
		 
		 do { ch=menuaffichage();
			 
			 switch(ch) {
			 
			 case 1:{     affichagedonn�es();   break;}
			 
			 case 2:{     affichageligne();   break;}
			 
			 case 3:{     affichagestation();  break;}
			 
			 case 4:{     affichagetroncon();  break;}
			 
					 
			 case 5: { return ;}
			 default:{ continue;}
			 
			 
			 }
			 
			 

		 }while(true);
		
		
	}
		 
	//methode d'application du choix de l'utilisateur sur la mise a jour des donn�es 
	//en appelant des methode implement� si dessous selon le choix
	
	public static void choixmiseajour() {
	     int ch;Scanner sc=new Scanner(System.in);int c;int choix; ;
		
		
		 do {
			 c=menumiseajour();
		 switch(c){
		 case 1:{  //ajouter
		          
		          do { ch=option();
		              switch(ch){ 
		              case 1:{      ajoutligne();           break;} //ajout d'une ligne
		              case 2:{      ajoutstation();        break;}  //ajout d'une station
		              case 3:{      ajoutnavette();         break;} //ajout d'une navette
		              default: continue;
		            }
		               
		          }while(ch!=4); break;
		       } 
		 
		 case 2:{ //modifier
			     do {  ch=option();
	                  switch(ch){
	                  case 1:{        //modifier une ligne
	        	             do {choix=modifierligne();
	        		          switch(choix){
	        		           case 1:{      modificationligne(choix);          break;}
			                   case 2:{      modificationligne(choix);         break;}
			                   default: continue;
	        		            } 
	        	                }while(choix!=3); break;
	                           }
	        	 
	                case 2:{ 
	        	             do {choix=modifierstation();
	        		           switch(choix){
	        		           case 1:{     modificationstation(choix);         break;}
			                   case 2:{      modificationstation(choix);          break;}
			                   case 3:{      modificationstation(choix);          break;}
			                   case 4:{      modificationstation(choix);           break;}
			                   default: continue;
	        		            } 
	        	               }while(choix!=5); break;}
	        	  
	                case 3:{                  
	        	             modificationnavette();
	        	             break;
	        	          }
	            
		                }
			          }while(ch!=4);break;
			       }
		 
		 case 3:{
			    do { ch=option();
	            switch(ch){
	             case 1:{        suppligne();    break;}
	             case 2:{       suppstation();        break;}
	             case 3:{    suppnavette();  break;}    
	              default: continue;
	               }
	             }while(ch!=4); break;
		          }
		 
		 case 4:{   return; }
		 default : continue; }
	   } while(true);
	  }
	
	
	
	
	// choix requetes recherche 
	
	

	public static void choixrecherche() {
		
		 int ch;Scanner sc=new Scanner(System.in);
		 
		 do { ch=menurecherche();
			 
			 switch(ch) {
			 
			 case 1:{    afficheligne1();   break;}
			 
			 case 2:{     chemin()  ; break;}
			 
			 case 3:{    affichestation();break;}
			 
			 case 4:{     correspondance() ;      break;}
			 
			 case 5:{    maxvoyageurs();     break;  }
			 
			 case 6:{    calculduree(); break; }
			 
			 
			 case 7: { return ;}
			 
			 default:{ continue;}
			 
			 
			 } 

		 }while(true);
		
		
	}
	       /////////////////////////////////////////////////////////////////////

	                //les methodes  

	//methode permet d'introduire les donn�es (cr�e une collection de ligne) si l'utilisateur veut cr�er 

	public static void  introductiondonn�es() {
		Scanner e=new Scanner(System.in);
		System.out.print("\ncombien de lignes voulez vous introduire :");
		int nb=e.nextInt();
		for(int i=0;i<nb;i++) {
			System.out.print("\ndonner le moyen de transport dans lequel vous voulez cr�e une ligne: ");
			MoyTransport.Moyen m=MoyTransport.Moyen.valueOf(e.next().toLowerCase());
			MoyTransport moy=new MoyTransport(m); moy.sasimoy();
			Ligne l=new Ligne(moy);  l.saisirl();
			introligne.add(l);
		}
		System.out.println("voulez vous affichez les donn�es que vous avez introduit?oui ou non? ");
		String ch=e.next().toLowerCase();
		if(ch.equals("oui")){
			
			System.out.println("\n affichage des lignes :");
			System.out.println("\n\n ***************************************************************\n ");
			for(int i=0;i<nb;i++) {
				System.out.println("\nla ligne n�"+i+"du"+" "+" "+introligne.get(i).getmoy()+":");
				introligne.get(i).laffiche();
			}
		 }
		
		 else{  System.out.println("\n");   }

		System.out.println("\n");
	}
	
	//diiferents methode de mise a jour
	
	//methode pour ajouter une ligne dans la collection
	
	public static void ajoutligne() {
		System.out.println("\nveuillez introduire les informations sur la ligne que vous desirez ajouter!\n");
		
		Scanner e=new Scanner(System.in);
		System.out.println("donner le moyen de transport dans lequel vous voulez cr�e une ligne:");
		
		MoyTransport.Moyen m=MoyTransport.Moyen.valueOf(e.next().toLowerCase());
		MoyTransport moy=new MoyTransport(m); moy.sasimoy();
		Ligne l=new Ligne(moy);  l.saisirl();
		donn�es.add(l); //ajouter la ligne a la collection de lignes

		System.out.println("\n\n voici la ligne que vous avez ajouter :\n ");	
		 donn�es.get(donn�es.size()-1).laffiche();
	}
	
	//methode pour ajouter une station a une ligne donn�es si elle existe  une position donn�es  dans une ligne si on ajoute une station implique qu'on va ajouter
	//deux troncon ou un depend de la position de la station
	
	public static void ajoutstation() {
		Scanner e=new Scanner(System.in);
		Station s=new Station();
		
		System.out.println("\ndonner le code de la ligne ou vous souhaitez ajoutez une station : ");
		String ch=e.next();
		System.out.println("\ndonner la position dans vous voulez ajouter votre station: ");
		int pos=e.nextInt();
		System.out.println("veuillez inroduire la nouvelle station :");
		s.saisirs();
		
		int i=0;
		while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
		if(i<=donn�es.size()) { 
			System.out.println("\nles stations de la ligne avant l'ajout : \n");
			donn�es.get(i).chemin();
			s.setligne(donn�es.get(i));
			donn�es.get(i).addstat( s, pos); 
			donn�es.get(i).addtroncon(s, pos);
			System.out.println("\nles stations de la ligne avant l'ajout : \n");
			donn�es.get(i).chemin(); }
		else {  System.out.println("la ligne n'existe pas !");}
		}
//ajouter une navette dans une ligne donn�e
	
	public static void ajoutnavette() {
		
		Scanner e=new Scanner(System.in);
		Navette s=new Navette();
		
		System.out.println("\ndonner le code de la ligne ou vous souhaitez ajoutez une station : ");
		String ch=e.next();
		
		System.out.println("veuillez inroduire la nouvelle navette que vous voulez ajouter :");
		 s.saisirn(); 
		 
		 int i=0;
			while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
			if(i<=donn�es.size()) {  
				System.out.println("les navettes de la lignes avant l'ajout");
				Navette.navcollect(donn�es.get(i).getnavette());
				s.setligne(donn�es.get(i));
				donn�es.get(i).addnavet(s); 
				System.out.println("les navettes de la lignes apres l'ajout");
				Navette.navcollect(donn�es.get(i).getnavette());}
			else {  System.out.println("la ligne n'existe pas !");}

	}
	
	// methode de modification 
	
	//modification d'une ligne 
	
	public static void modificationligne(int i) {
		Scanner e=new Scanner(System.in);
		
		System.out.println("donner le code de la ligne dans laquelle vous voulez modifier :"); String ch=e.next();
	   switch(i) {
		 
		case 1:{ int j=0;
			System.out.println("donner la  nouvelle station depart :"); 
			Station stat=new Station();stat.saisirs();
			while(!donn�es.get(j).getnuml().equals(ch)) { i++;}
		    if(j<=donn�es.size()) {
		    	//l=donn�es.get(j);
		    	System.out.println("la station depart avant modification :"); donn�es.get(j).getstatdepart().toString();
		    	 stat.setligne(donn�es.get(j));donn�es.get(j).setstatdepart(stat);
		    	 System.out.println("la station depart avant modification :"); donn�es.get(j).getstatdepart().toString();
		    	          }
		    else {  System.out.println("la ligne n'existe pas !"); }
            break;
		}
		case 2:{
			int j=0;
			System.out.println("donner la  nouvelle station arriv�e :"); 
			Station stat=new Station();stat.saisirs();
			while(!donn�es.get(j).getnuml().equals(ch)) { i++;}
		    if(j<=donn�es.size()) {
		    	//l=donn�es.get(j);
		    	System.out.println("la station arriv�e avant modification :"); donn�es.get(j).getstatarrivee().toString();
		    	 stat.setligne(donn�es.get(j));donn�es.get(j).setstatdepart(stat);
		    	 System.out.println("la station arriv�e avant modification :"); donn�es.get(j).getstatarrivee().toString();
		    	          }
		    else {  System.out.println("la ligne n'existe pas !"); }
            break;
			
		}
		}
		
	}
	
	
	public static void modificationstation(int i) {
		Scanner e=new Scanner(System.in);
		
		System.out.println("donner le code de la ligne dans laquelle vous voulez modifier :"); String ch=e.next();
		System.out.println("donner le nom de la station dont vous voulez modifier!"); String s=e.next()	;
		
		
		switch(i) {
		
		case 1:{
			
			 int j=0;
				while((!donn�es.get(j).getnuml().equals(ch))) { j++;}
			    if(j<=donn�es.size()) {
			    	int z=0;
			    	while((z<donn�es.get(j).getstatint().size())&&(!donn�es.get(j).getstatint().get(z).getnom().equals(s))){
			    		z++;}
			    	if(donn�es.get(j).getstatint().get(z).getnom().equals(s)) {
			    		System.out.println("donner le nouveau nom de votre station");
			    		System.out.println("la station avant modification:"+donn�es.get(j).getstatint().get(z).toString());
			    		String stat=e.next(); donn�es.get(j).getstatint().get(z).setnom(stat);
			    		System.out.println("la station apres modification:"+donn�es.get(j).getstatint().get(z).toString());
			    	}
			    	else { System.out.println("cette station n'existe pas !");
			    	}
			    	}
			    else {  System.out.println("la ligne n'existe pas !"); }
			
			break;
		}
		
    case 2:{
			
    	 int j=0;
			while((!donn�es.get(j).getnuml().equals(ch))) { j++;}
		    if(j<=donn�es.size()) {
		    	int z=0;
		    	while((z<donn�es.get(j).getstatint().size())&&(!donn�es.get(j).getstatint().get(z).getnom().equals(s))){
		    		z++;}
		    	if(donn�es.get(j).getstatint().get(z).getnom().equals(s)) {
		    		System.out.println("donner le nouveau num de votre station");int num=e.nextInt();
		    		System.out.println("la station avant modification:"+donn�es.get(j).getstatint().get(z).toString());
		    		 donn�es.get(j).getstatint().get(z).setnum(num);
		    		System.out.println("la station apres modification:"+donn�es.get(j).getstatint().get(z).toString());
		    	}
		    	else { System.out.println("cette station n'existe pas !");
		    	}
		    	}
		    else {  System.out.println("la ligne n'existe pas !"); }
		
		break;
		
		}
		
		
  case 3:{
	
	  int j=0;
		while((!donn�es.get(j).getnuml().equals(ch))) { j++;}
	    if(j<=donn�es.size()) {
	    	int z=0;
	    	while((z<donn�es.get(j).getstatint().size())&&(!donn�es.get(j).getstatint().get(z).getnom().equals(s))){
	    		z++;}
	    	if(donn�es.get(j).getstatint().get(z).getnom().equals(s)) {
	    		System.out.println("donner le nouveau etat de votre station");String stat=e.next(); 
	    		System.out.println("la station avant modification:"+donn�es.get(j).getstatint().get(z).toString());
	    		donn�es.get(j).getstatint().get(z).setype(stat);
	    		System.out.println("la station apres modification:"+donn�es.get(j).getstatint().get(z).toString());
	    	}
	    	else { System.out.println("cette station n'existe pas !");
	    	}
	    	}
	    else {  System.out.println("la ligne n'existe pas !"); }
	
	 break;
   }
	
  case 4:{
	 
	  int j=0;
	  while((!donn�es.get(j).getnuml().equals(ch))) { j++;}
	  if(j<=donn�es.size()) {
	    	int z=0;
	    	while((z<donn�es.get(j).getstatint().size())&&(!donn�es.get(j).getstatint().get(z).getnom().equals(s))){
	    		z++;}
	    	if(donn�es.get(j).getstatint().get(z).getnom().equals(s)) {
	    		System.out.println("donner le nouvelle station de votre station");
	    		Station st=new Station(); st.setligne(donn�es.get(j)); st.saisirs();
	    		System.out.println("la station avant modification:"+donn�es.get(j).getstatint().get(z).toString());
	    		donn�es.get(j).getstatint().get(z).setstation(st);
	    		System.out.println("la station apres modification:"+donn�es.get(j).getstatint().get(z).toString());
	    		donn�es.get(j).chemin();
	    	}
	    	else { System.out.println("cette station n'existe pas !");
	    	}
	    	}
	    else {  System.out.println("la ligne n'existe pas !"); }
	   
	  
	  
	  
	  
  }
		
}
		
}
	
	public static void modificationnavette(){
		
		Navette n=new Navette();
       Scanner e=new Scanner(System.in);
		
		System.out.println("donner le code de la ligne dans laquelle vous voulez modifier :"); String ch=e.next();
		System.out.println("donner le nom de la navette dont vous voulez modifier!"); String s=e.next()	;
		
		 int j=0;
		  while((!donn�es.get(j).getnuml().equals(ch))) { j++;}
		  if(j<=donn�es.size()) {
			  int z=0;
			  while((z<donn�es.get(j).getnavette().size())&&(!donn�es.get(j).getnavette().get(z).getmarque().equals(s))){
		    		z++;}
			  if(donn�es.get(j).getnavette().get(z).getmarque().equals(s)){
				  System.out.println("introduisez la nouvelle navette");
				  n.saisirn(); n.setligne(donn�es.get(j));
				  System.out.println("la navette avant modification:"+donn�es.get(j).getnavette().get(z).toString());
				  donn�es.get(j).getnavette().get(z).setnavette(n);
				   System.out.println("la navette apres modification:"+donn�es.get(j).getnavette().get(z).toString());
			  }
		  
			  
		  }
	
		
	}
	
	
	//methode de suppresions
	
	//suppression d'une ligne en donnant le code de la ligne 
	
	public static void suppligne() {
		
		Scanner e=new Scanner(System.in);
		System.out.println("\ndonner le code de la ligne dont vous voulez supprimer : ");
		String ch=e.next();
		
		 int i=0;
			while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
		    if(i<=donn�es.size()) {
		    	donn�es.remove(i);  }
		    else {  System.out.println("la ligne n'existe pas !"); }
		
	}

	//suppression d'une station en donnant le code de la ligne ==> la suppresion d'un troncon ou le fusionnement de 
	//deux troncon consecutif ayant la station en question en commun
	
	public static void suppstation() {
		
		Scanner e=new Scanner(System.in);
		System.out.println("\ndonner le code de la ligne ou vous souhaitez supprimer une station : ");
		String ch=e.next();
		System.out.println("\ndonner le nom de la station que vous voulez supprimer : ");
		String st=e.next();
		 int i=0;
			while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
		    if(i<=donn�es.size()) {
		    	System.out.println("les stations de la ligne avant la suppression: : ");
				donn�es.get(i).chemin();
		    	 donn�es.get(i).removestat(ch);
		    	 donn�es.get(i).fusionnertronc(st);
		    	 System.out.println("\nles stations de la ligne apres la suppression: : ");
		    	 donn�es.get(i).chemin();
		    	 }
		    else {  System.out.println("la ligne n'existe pas !"); }
	
	}
	
	//suppression d'une navette
	public static void suppnavette() {
		
		Scanner e=new Scanner(System.in);
		System.out.println("\ndonner le code de la ligne ou vous souhaitez asupprimer une navette : ");
		String ch=e.next();
		System.out.println("\ndonner le marque de la navette que vous voulez supprimer : ");
		String st=e.next();
		
		 int i=0;
			while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
		    if(i<=donn�es.size()) {
		    	System.out.println("les navettes de la ligne avant la suppression: : ");
		    	Navette.navcollect(donn�es.get(i).getnavette());
		    	 donn�es.get(i).removenavet(st);
		    	 System.out.println("\nles navettes de la ligne apres la suppression: : ");
		    	 Navette.navcollect(donn�es.get(i).getnavette());
		    	 }
		    else {  System.out.println("la ligne n'existe pas !"); }
	
		
	}
	
	
	

	//differents methodes d'affichage tout depend le choix de l'utilisateur 
	
	//methode pour afficher tout les donn�es de la collections de ligne (toutes les lignes) 
	
	public static void   affichagedonn�es() {
		
		for(int i=1;i<donn�es.size();i++) {
			
			System.out.println("\n\n ***************************************************************\n ");
			System.out.println("la ligne du :"+donn�es.get(i-1).getmoy().getmoy()+"\t"+donn�es.get(i-1).getnuml());
			donn�es.get(i-1).laffiche();
			
		}
	}
	
	//methode qui affiche les informations d'une ligne en donnant le code de la ligne 
	
	public static void affichageligne() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("\ndonner le code de la ligne dans lequel vous voulez affichez les informations sur cette ligne:");
		 String s=sc.next();
		 
		 //donn�es.contains(donn�es.get(i));
		 int i=0;
		 while(!donn�es.get(i).getnuml().equals(s)) { i++; }
		 if(i==donn�es.size()) {  System.out.println("\ncette ligne n'existe pas !"); }
		
		 else { donn�es.get(i).laffiche(); }
		
	}
	//methode permet d'afficher une station en donnant le nom de la station et on cherche sur toute la collection de lignes
	
	public static void affichagestation() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("veuillez introduire la station que vous voulez affichez:");  String s=sc.next().toLowerCase();
		 int i=0;
		 
		 while(i<donn�es.size()) {
			 int j=0;
			 while((j<donn�es.get(i).getstatint().size())&&(!donn�es.get(i).getstatint().get(j).getnom().equals(s)))
             { j++; }
			 if(j<donn�es.get(i).getstatint().size()) {donn�es.get(i).getstatint().get(j).saffiche(); break;  }
			 else { i++; }
			
		 }
		if(i==donn�es.size()) { System.out.println("cette station n'exite pas!");}
	}
	
	//methode permet d'afficher un troncon on donnant la station debut et station fin 
	
	public static void affichagetroncon() {
		Scanner sc=new Scanner(System.in);
		 System.out.print("\nveuillez introduire la station debut du tron�on :");  String s1=sc.next().toLowerCase();
		 System.out.print("\nveuillez introduire la station fin du tron�on :");  String s2=sc.next().toLowerCase();
		 System.out.print("\n");
      int i=0;
		 
		 while(i<donn�es.size()) {
			 int j=0;
			 while((j<donn�es.get(i).gettroncon().size())&&(!donn�es.get(i).gettroncon().get(j).getstatdebut().getnom().equals(s1))
					 &&(!donn�es.get(i).gettroncon().get(j).getstatfin().getnom().equals(s2)))
             { j++; }
			 if((j<donn�es.get(i).gettroncon().size())&&(donn�es.get(i).gettroncon().get(j).getstatdebut().getnom().equals(s1)
					 &&(donn�es.get(i).gettroncon().get(j).getstatfin().getnom().equals(s2))))
					 {donn�es.get(i).gettroncon().get(j).taffiche();; break;  }
			 else { i++; }
			
		 }
		if(i==donn�es.size()) { System.out.println("ce tron�on n'exite pas!");}
	}
		
	
	
	//requetes de recherches
	
	//methode
	
	public static void  afficheligne1() {
		
		for(int i=0;i<donn�es.size();i++) {
			
			System.out.println(donn�es.get(i).toString());
			System.out.println("\n");
		}
		

			}
	
	//affichage du chemin en donnant la ligne 
	
	public static void chemin() {
		Scanner e=new Scanner(System.in);
		System.out.println("donner le code de la ligne que vous voulez afficher son chemin :");
		String ch=e.next();
		 int i=0;
			while(!donn�es.get(i).getnuml().equals(ch)) { i++;}
			if(i<donn�es.size()) {
				donn�es.get(i).chemin();
			}
	}
	
	public static void affichestation() {
		
		Scanner e=new Scanner(System.in);
		System.out.println("donner le numero de la station que vous voulez :");
		int  s=e.nextInt();
		int i=0;
		while(i<donn�es.size()) {
			
			for(int j=0;j<donn�es.get(i).getstatint().size();j++) {
				
				if(donn�es.get(i).getstatint().get(j).getnum()==s) {
					System.out.println("cette station passe par la ligne:\n"+donn�es.get(i).getnuml());
				}
			}
			i++;
		}
		
	}
	
	//methode pour chercher la ligne emprunt� par le plus grand nombre de voyageurs
	
	public static void maxvoyageurs() {
		Scanner e=new Scanner(System.in);
		int max=0;int i=0; int maxligne=0;
		while((i<donn�es.size())) {
			
			if(donn�es.get(i).getmoy().getnb()>max) {
				max=donn�es.get(i).getmoy().getnb();
				maxligne=i;
			}
          i++;
		}
       System.out.println("la ligne emprunt� par le plus grand nombre de voyageurs est :"+donn�es.get(maxligne).toString());
	}
	
	//affochage des station  de correspondance
	
	public static void correspondance() {
		
		System.out.println("les stations de correspondance :\n");
		
		int i=0;
		while(i<donn�es.size()) {
			int bool=0;
			for(int j=0;j<donn�es.get(i).getstatint().size();j++) {
				
				if(donn�es.get(i).getstatint().get(j).gettype().equals("principale")) {
					
					bool=1;;
				}
			}
			
			if(bool==1) {
				System.out.println(donn�es.get(i).toString());
			}
			i++;
		}
		
		
	}
	
	public static void calculduree() {
		 Station  s1 = null;  Station s2 = null;
		Scanner e=new Scanner(System.in);
		System.out.println("donner le code de la ligne lequel vous voulez calculer la duree d'un point A a un point B:");
		String ch=e.next();
		System.out.println("donner la station depart A :");
		String a=e.next();
		System.out.println("donner la station depart A :");
		String b=e.next(); 
		int i=0;
		while((i<donn�es.size())&&(!donn�es.get(i).getnuml().equals(ch))){
			i++;
		}
		if((i<donn�es.size())) {
			int j=0;
			while(j<donn�es.get(i).getstatint().size()) {
				if(donn�es.get(i).getstatint().get(j).getnom().equals(a)) {
					 s1=donn�es.get(i).getstatint().get(j);
				}
				else {
					if(donn�es.get(i).getstatint().get(j).getnom().equals(b)) {
						s2=donn�es.get(i).getstatint().get(j);
					}
				}
				j++;
			}  
			double d=donn�es.get(i).calculduree(s1, s2);
			System.out.println("la dur�e estim� est :"+String.format("%.2f", (float) d)+"min");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		 
		//"donn�es " est  une collection de lignes qui va etre rempli grace aux methodes de la classes remplissage  au debut du programme
		//les  donn�es seront pr�alablement definis 
		
		donn�es=Remplissage.remplir();
       
		
        Scanner e=new Scanner(System.in);
           int choix ;int m;

           do {
               choix=menu1();
               switch(choix) {

               case 1:{ introductiondonn�es() ; break; }

               case 2:{ choixmiseajour();   break;  }

               case 3:{  choixrecherche();       break; }

               case 4 :{     choixaffichage();    break; }
           
               case 5:{   System.exit(4);  }
               default : continue;
               }

           }while(true);
		
	}
}
