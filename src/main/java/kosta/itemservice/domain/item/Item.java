package kosta.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer amount;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer amount) {
        this.itemName = itemName;
        this.price = price;
        this.amount = amount;
    }
}
