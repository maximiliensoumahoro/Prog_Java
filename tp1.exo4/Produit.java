/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author max
 */
public class Produit {
    private String id ;
    private String nom ;
    private double prix;
    private int quantite;
    
public Produit(String id, String nom, double prix, int quantite){
this.id=id;
this.nom=nom;
this.prix=prix;
this.quantite=quantite;
}
public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    // Setters : modifier
    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
      public void afficherDetails() {
        System.out.println("ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Prix : " + prix + " €");
        System.out.println("Quantité : " + quantite);
    }

}
