package sia.tacocloud;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class TacoOrder {
    
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
