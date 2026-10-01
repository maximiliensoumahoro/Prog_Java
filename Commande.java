/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

public class Commande {

    private String idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    public Commande(String idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        this.total = panier.calculerTotal();
    }

    public void afficherDetailsCommande() {
        System.out.println("=== Commande " + idCommande + " ===");
        System.out.println("Client : " + client.getNom() + " (" + client.getEmail() + ")");
        System.out.println("Produits :");
        for (int i = 0; i < produitsCommandes.size(); i++) {
            System.out.println("- " + produitsCommandes.get(i).getNom() + " : " + produitsCommandes.get(i).getPrix() + " €");
        }
        System.out.println("Total : " + total + " €");
    }
}
