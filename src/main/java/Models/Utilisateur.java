package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Users")
public class Utilisateur {
    @Column
    @Id
    private String Id_utilisateur;
    @Column
    public String nom_utilisateur;
    @Column
    public String prenom_utilisateur;
    @Column
    public String email_utilisateur;
    @Column
    public String password_utilisateur;

public void setId_utilisateur(String idUtilisateur) {
        this.Id_utilisateur = idUtilisateur;
    }

    public String getId_utilisateur() {
        return Id_utilisateur;
    }
}