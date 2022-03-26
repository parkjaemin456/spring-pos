package itc.hoseo.pos.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //TODO 속성과 테스트케이스까지 만들어주세염
    private Integer id;
    private String name;
    private Integer price;
    private Integer stockQuantity;
    private String item;

    public void addStock(int stock){
        this.stockQuantity = stockQuantity;
        stockQuantity += stock;
    }
    public void removeStock(int stock){
        this.stockQuantity = stockQuantity;
        stockQuantity -= stock;
    }
}
