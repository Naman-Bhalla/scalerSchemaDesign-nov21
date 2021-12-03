package dev.naman.scalerschemadesignnov21.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    private String name;

    @ManyToMany
    private List<Student> students;
}
