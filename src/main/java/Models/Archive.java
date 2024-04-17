package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="archives")
public class Archive {
    @Id
    @Column
    public String Id_device;
    @Column
    public Date date;
    @Column
    public Float Consommation ;
    @Column
    public Float Emmisions_carbone;
}
