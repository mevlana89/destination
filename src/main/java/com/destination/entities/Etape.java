package com.destination.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ville;
    private String dateDebutEtape;
    private String resumeEtape;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;

    @OneToMany(mappedBy = "etape", orphanRemoval = true)
    private List<Lien> liens;

    public List<Lien> getLiens() {
        return liens;
    }

    public void setLiens(List<Lien> liens) {
        this.liens = liens;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDateDebutEtape() {
        return dateDebutEtape;
    }

    public void setDateDebutEtape(String dateDebutEtape) {
        this.dateDebutEtape = dateDebutEtape;
    }

    public String getResumeEtape() {
        return resumeEtape;
    }

    public void setResumeEtape(String resumeEtape) {
        this.resumeEtape = resumeEtape;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
