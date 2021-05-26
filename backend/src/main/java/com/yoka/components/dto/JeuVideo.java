package com.yoka.components.dto;

public class JeuVideo extends Theme {

    private String type;
    private String createur;
    private String modeDeJeu;
    private String plateforme;

    public JeuVideo(String imagePath, String titre, String langue, String dateSortie, String genre, Double note, String type, String createur, String modeDeJeu, String plateforme) {
        super(imagePath, titre, langue, dateSortie, genre, note);
        this.type = type;
        this.createur = createur;
        this.modeDeJeu = modeDeJeu;
        this.plateforme = plateforme;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getModeDeJeu() {
        return modeDeJeu;
    }

    public void setModeDeJeu(String modeDeJeu) {
        this.modeDeJeu = modeDeJeu;
    }

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }
}
