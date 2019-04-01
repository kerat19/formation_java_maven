package fr.dessin;

/**
 *
 * @author Smile
 *
 */
public class Run {

	public static void main(String[] args) {

		System.out.println("==================== Exo 1 =======================");

		final int x = 3;
		final int y = 5 ;

		final Point2D point = new Point2D();

		//		point.setX(12);
		//		point.setY(8);
		point.afficher();
		point.translater(x,y);


		System.out.println("==================== Exo 2 =======================");

		final Point2D point2 = new Point2D(x,y);

		//		point.setX(12);
		//		point.setY(8);
		point2.afficher();
		point2.translater(x,y);

	}

}
