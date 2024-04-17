package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name = "notifications_alerts")

public class Notification_alertes {
    @Column
    @Id
    private String Id_device;
    @Column
    private String Type_alerte ;
    @Column
    public Date Date_alerte;
    @Column
    public String Description_alerte;
    @Column
    public String Gravite ;
}
