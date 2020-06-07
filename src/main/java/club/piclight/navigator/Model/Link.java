package club.piclight.navigator.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "link")
public class Link {
    @Id
    private Long id;
    private Long targetId; //目标id
    private String name; //链接名
    private String uri; //链接
    private Long typeId; //类型id
}
