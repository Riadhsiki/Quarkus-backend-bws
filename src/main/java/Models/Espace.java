package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "espace")

public class Espace {
    @Column
    @Id
    public String Id_device;
    @Column
    public String Localisation ;
}
