package com.example.daffyduck.monadapter;

/**
 * Created by daffyduck on 16/08/2016.
 */
public class Contact {
    private String nom;
    private String numero;
    private int photo;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumero() {
        return numero;
    }

    public Contact(String nom, String numero, int photo) {
        this.nom = nom;
        this.numero = numero;
        this.photo = photo;
    }

    public void setNumero(String numero) {
        this.numero = numero;

    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
