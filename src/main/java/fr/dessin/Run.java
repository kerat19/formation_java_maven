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

		System.out.println("==================== Exo 4 =======================");

		System.out.println(	"Compteur : " + Point2D.getCompteur());


		System.out.println("==================== Exo 5 =======================");

		final int z = 2;
		final Point3D point3 = new Point3D(x,y,z);

		point3.setX(10);
		point3.setY(5);
		point3.afficher();
		point3.translater(x,y);
		point3.translater(x,y,z);

		System.out.println("==================== Exo 5 Bis =======================");

		final Point3DBis point4 = new Point3DBis(x,y,z);

		point4.point.setX(18);
		point4.point.setY(6);
		point4.afficher();
		point4.translater(x,y,z);

	}

}
