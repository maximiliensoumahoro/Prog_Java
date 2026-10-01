/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

public class Panier {

    private ArrayList<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    public void afficherPanier() {
        if (produits.size() == 0) {
            System.out.println("Le panier est vide.");
        } else {
            for (int i = 0; i < produits.size(); i++) {
                produits.get(i).afficherDetails();
            }
        }
    }

    public double calculerTotal() {
        double total = 0;
        for (int i = 0; i < produits.size(); i++) {
            total = total + produits.get(i).getPrix();
        }
        return total;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }
}
