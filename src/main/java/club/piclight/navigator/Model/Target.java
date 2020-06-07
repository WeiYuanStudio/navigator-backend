package club.piclight.navigator.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "target")
public class Target {
    public Target(){}
    public Target(club.piclight.navigator.API.ViewModel.Target target) {
        this.name = target.getName();
        this.description = target.getDescription();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
}
