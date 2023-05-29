package com.mov.movlist.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.NotFound;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity // entite jpa qui a un id
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotFound
    private String nom;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date dateMovie;
    private boolean novel;
    private String genreee;
    private String plot;

    //private Titre titre;

    public Movie(

    ) {
        super();
    }

    public Movie(String nom, Date dateMovie, boolean novel, String genreee, String plot, String numeroTelephone) {
        this.nom = nom;
        this.dateMovie = dateMovie;
        this.novel = novel;
        this.genreee = genreee;
        this.plot = plot;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateMovie=" + dateMovie +
                ", novel=" + novel +
                ", genreee='" + genreee + '\'' +
                ", plot='" + plot + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateMovie() {
        return dateMovie;
    }

    public void setDateMovie(Date dateMovie) {
        this.dateMovie = dateMovie;
    }

    public boolean isNovel() {
        return novel;
    }

    public void setNovel(boolean novel) {
        this.novel = novel;
    }


    public String getGenreee() {
        return genreee;
    }

    public void setGenreee(String genreee) {
        this.genreee = genreee;
    }

    public String getplot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }


   /* public Titre getTitre() {
        return titre;
    }

    public void setTitre(Titre titre) {
        this.titre = titre;
    }

    */


}

