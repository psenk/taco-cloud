package sia.tacocloud;

import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class Taco {
    
    private String name;
    private List<Ingredient> ingredients;
    
}