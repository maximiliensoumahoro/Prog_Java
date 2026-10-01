/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit("P1", "Clavier", 29.99, 10));
        magasin.ajouterProduit(new Produit("P2", "Souris", 15.00, 20));
        magasin.ajouterProduit(new Produit("P3", "Ecran", 149.99, 5));

        Client client = new Client("C1", "Max", "max@efrei.net");
        Panier panier = new Panier();

        int choix;

        do {
            System.out.println("--- Menu Magasin ---");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer la commande");
            System.out.println("5. Quitter");
            System.out.println("Votre choix :");
            choix = sc.nextInt();

            switch (choix) {
                case 1 -> magasin.afficherProduitsDisponibles();

                case 2 -> {
                    System.out.println("Nom du produit :");
                    String nom = sc.next();
                    Produit p = magasin.trouverProduitParNom(nom);
                    if (p != null) {
                        panier.ajouterProduit(p);
                        System.out.println(nom + " ajouté au panier.");
                    } else {
                        System.out.println("Produit introuvable.");
                    }
                }

                case 3 -> {
                    panier.afficherPanier();
                    System.out.println("Total : " + panier.calculerTotal() + " €");
                }

                case 4 -> {
                    Commande commande = new Commande("CMD1", client, panier);
                    commande.afficherDetailsCommande();
                }

                case 5 -> System.out.println("Au revoir !");

                default -> System.out.println("Choix invalide.");
            }

        } while (choix != 5);
    }
}
