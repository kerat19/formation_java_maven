package fr.banque;

import java.util.ArrayList;

/**
 *
 * @author Smile
 *
 */
public class Client {

	public String nom;
	public String prenom;
	public int age;
	public int numero;

	ArrayList<Compte> compte = new ArrayList<Compte>();

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, int age, int numero) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	public void ajouterCompte(Compte unCompte) {

		this.compte.add(unCompte);
	}


	public Compte getCompte(int numeroCompte) {

		try {
			for(final Compte tab : this.compte){
				if (tab.getNumero() == numeroCompte) {
					return tab;
				}
			}
		}
		catch(final Exception e) {
			System.out.println("Aucun compte existe ! ");
		}
		return null ;
	}



	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setCompte(ArrayList<Compte> compte) {
		this.compte = compte;
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

}
