package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "item")
public class ItemEntity {
    @Id
    private String itemCode;
    private String itemName;
    private String itemCategory;
    private String itemSize;
    private Double itemUnitPrice;
    private Integer itemQty;
    private String supplierId;
}
