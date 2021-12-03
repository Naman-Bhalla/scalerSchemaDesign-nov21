package dev.naman.scalerschemadesignnov21.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Student extends BaseModel {
    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "students")
    private List<Batch> batches;
}
