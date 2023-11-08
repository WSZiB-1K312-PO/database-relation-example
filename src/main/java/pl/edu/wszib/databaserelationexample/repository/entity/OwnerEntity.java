package pl.edu.wszib.databaserelationexample.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OwnerEntity {
    @Id
    private OwnerKey id;
    private String name;
    private String surname;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "OWNER_FIRST_ID"),
            @JoinColumn(name = "OWNER_SECOND_ID")
    })
    private Collection<VehicleEntity> vehicles;
}
