package fr.dessin;
/**
 *
 * @author Smile
 *
 */
public class Point2D {

	int x,y;
	static int compteur;

	public Point2D() {
		final int x = 0;
		final int y = 0;
	}

	public Point2D(int vX, int vY) {
		this.x = vX;
		this.y = vY;
		this.compteur ++;
	}

	/**
	 *  la méthode afficher
	 */
	public void afficher() {
		System.out.println(" =====> Méthode Afficher:");
		System.out.println("La valeur de X=" + getX() + " et la valeur de Y=" + getY());
	}

	/**
	 *
	 * @param dX
	 * @param dY
	 * Une méthode pour translater le point
	 */
	public void translater(int dX, int dY) {
		this.x = this.x+dX ;
		this.y = this.y+dY;
		System.out.println(" =====> Méthode Translater:");
		System.out.println("La valeur de X=" + this.x + " et la valeur de Y= " + this.y);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Point2D.compteur = compteur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Point2D other = (Point2D) obj;
		if (this.x != other.x) {
			return false;
		}
		if (this.y != other.y) {
			return false;
		}
		return true;
	}


}
