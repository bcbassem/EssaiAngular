import java.util.Scanner;
public class RoseBlanche {
      public static void main(String[] args) {
		
		int argent,achatLivre,nbreCafe,numflash,billetmetro,rose;
		float reste,modulo,part;
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Combien avez-vous reçu d'argent (Dinars)?");
		argent= clavier.nextInt();
		achatLivre= 3*argent/4;
		modulo= 3*argent%4;
		reste=(argent-achatLivre)+modulo;
	
		part=reste/3;
		nbreCafe=(int)part/2;
		numflash=(int)part/4;
		billetmetro=(int)part/3;
		rose=(int)Math.round((part-(nbreCafe*2))+(part-(numflash*4))+(part-(billetmetro*3)));
		System.out.println("Livre et Fournitures: "+ achatLivre +" Dinars");
		System.out.println("Vous pouvez ensuite acheter:\n"+nbreCafe+" cafes\n"+numflash+" numéros du Flash Informatique\n"+
		billetmetro+"billets de métro\n"+"et il vous restera "+ rose+" Dinars pour les roses blanches.");
	    
	  
	}
}
