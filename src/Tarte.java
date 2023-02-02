import java.util.*;
public class Tarte {

	public static void main(String[] args) {
		
		final int BASE=8;
		double oeuf=4;
		double farine=125;
		double sucre=125;
		double lait=10.0;
		int nbPersonnes;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veillez saisir le nombre de personnes");
		nbPersonnes=clavier.nextInt();
		oeuf = oeuf * nbPersonnes / BASE;
		farine = farine * nbPersonnes / BASE;
		sucre = sucre * nbPersonnes / BASE;
		lait = lait * nbPersonnes / BASE;
		System.out.println
		("Pour faire une génoise pour "+nbPersonnes+" personnes, il vous faut : \n"
		+ oeuf +" oeuf(s)\n"
		+ farine +" de farine\n"
		+ sucre +" gr de sucre\n"
		+ lait+ " cl de lait\nde la vanille à volonté");
		clavier.close();
	}

}

