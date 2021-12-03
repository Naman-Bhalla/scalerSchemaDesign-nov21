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


// IDiscount
// Discount {
//   private int maximumValue;
//   private int percent;
// }
// discounts
// id | maxValue | percent
// products
// id | name | brand
// you can actually store the code in a db
// createNewDiscount() -> push to code => type checking
// DDL -> Data Descrip[tion Language
// 12 PRODUCT DISCOUNT PERCENT
// DDLParser.calculateDiscount(Product, String) {} ->
