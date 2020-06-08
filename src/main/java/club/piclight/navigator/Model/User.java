package club.piclight.navigator.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class User {
    @Id
    private Long uid;
    private String name;
    private String mail;
    private String userGroup;
}
