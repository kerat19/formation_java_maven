package fr.dessin;
/**
 *
 * @author Smile
 *
 */
public class Point2D {

	int x,y;
	public Point2D() {
		final int x = 0;
		final int y = 0;
	}

	public Point2D(int vX, int vY) {
		this.x = vX;
		this.y = vY;
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

}
