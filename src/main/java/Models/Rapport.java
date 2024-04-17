package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rapports")
public class Rapport {
   @Column
   @Id
    public String Id;
    @Column
    public String Rapport ;
}
