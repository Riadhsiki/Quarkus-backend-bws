package Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devices")
public class Device{
    @Column
    @Id
    public String Id_device;
    @Column
    public String nomDevice;
    @Column
    public String site;
    @Column
    public Float consoElec;
    @Column
    public Float emissionCarbone;
    @Column
    public Float seuilConso;
}