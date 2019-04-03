package fr.banque;

/**
 *
 * @author Smile
 *
 */
public class Run {

	public static void main(String[] args) {

		System.out.println("==================== Exo 6 =======================");

		final Compte compte1 = new Compte(1, 123.52);
		final Compte compte2 = new Compte(2, 52.00);
		final Compte compte3 = new Compte(3, 896.23);

		final Client client = new Client("Tarek", "Takmen", 31 , 155646);
		client.ajouterCompte(compte1);
		client.ajouterCompte(compte2);
		client.ajouterCompte(compte3);

		System.out.println("le client :" + client.getNom() + " "+client.getPrenom()+ " " + client.getAge());
		System.out.println("le solde du Compte :" + client.getCompte(1).getSolde());

	}


}
