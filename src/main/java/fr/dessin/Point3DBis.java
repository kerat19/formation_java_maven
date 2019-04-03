package fr.dessin;
/**
 *
 * @author Smile
 *
 */

public class Point3DBis extends Object{
	int z;

	Point2D point = new Point2D();

	public Point3DBis (int vX, int vY, int vZ) {
		super();
		this.point.setX(vX);
		this.point.setY(vY);
		this.z = vZ;
	}

	/**
	 *  la méthode afficher
	 */

	public void afficher() {
		System.out.println(" =====> Méthode Afficher:");
		System.out.println("La valeur de X=" + this.point.getX() + " et la valeur de Y=" + this.point.getY()+ " et la valeur de Z=" + this.getZ());
	}


	/**
	 *
	 * @param dZ
	 */
	public void translater(int dX, int dY,int dZ) {

		System.out.println(" =====> Méthode Translater:");
		System.out.println("La valeur de X=" + this.point.getX() + " et la valeur de Y= " + this.point.getY() + " et la valeur de Z= " + this.z);
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
