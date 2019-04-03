package fr.dessin;

/**
 *
 * @author Smile
 *
 */
public class Point3D extends Point2D{

	int z;

	public Point3D() {
		// TODO Auto-generated constructor stub
	}

	public Point3D(int vX, int vY, int vZ) {
		super();
		this.z = vZ;
	}


	/**
	 *  la méthode afficher
	 */
	@Override
	public void afficher() {
		System.out.println(" =====> Méthode Afficher:");
		System.out.println("La valeur de X=" + getX() + " et la valeur de Y=" + getY()+ " et la valeur de Z=" + getZ());
	}

	/**
	 *
	 */
	@Override
	public void translater(int dX, int dY) {
		System.out.println(" =====> Méthode Translater:");
		System.out.println("La valeur de X=" + this.x + " et la valeur de Y= " + this.y);
	}

	/**
	 *
	 * @param dZ
	 */
	public void translater(int dX, int dY,int dZ) {

		System.out.println(" =====> Méthode Translater:");
		System.out.println("La valeur de X=" + this.x + " et la valeur de Y= " + this.y + " et la valeur de Z= " + this.z);
	}




	@Override
	public String toString() {
		return "Point3D [z=" + this.z + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.z;
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
		final Point3D other = (Point3D) obj;
		if (this.z != other.z) {
			return false;
		}
		return true;
	}

	public int getZ() {
		return this.z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
