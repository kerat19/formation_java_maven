package fr.banque;
/**
 *
 * @author Smile
 *
 */
public class Compte {

	private int numero;
	private double solde;

	public Compte() {
	}

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}

	/**
	 *
	 * @param unMontant
	 * ajoute de l'argent au solde du compte
	 */
	public void ajouter(double unMontant) {
		this.solde += unMontant;
	}

	/**
	 *
	 * @param unMontant
	 * retire de l'argent au solde du compte
	 */
	public void retirer(double unMontant) {
		this.solde -= unMontant;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public int getNumero() {
		return this.numero;
	}


	protected void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return this.solde;
	}

	protected void setSolde(double solde) {
		this.solde = solde;
	}

}
