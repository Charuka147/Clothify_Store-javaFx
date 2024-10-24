package entity;

import jakarta.persistence.Entity;
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
@Table(name =  "order_details")
public class OrderDetailsEntity {

        private String orderId;
        private String itemCode;
        private Integer qty;
        private Double discount;

    }