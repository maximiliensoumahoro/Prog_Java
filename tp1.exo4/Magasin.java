/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

public class Magasin {

    private ArrayList<Produit> produits = new ArrayList<>();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        System.out.println("=== Produits disponibles ===");
        for (int i = 0; i < produits.size(); i++) {
            produits.get(i).afficherDetails();
            System.out.println("---");
        }
    }

    public Produit trouverProduitParNom(String nom) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getNom().equals(nom)) {
                return produits.get(i);
            }
        }
        return null;
    }
}