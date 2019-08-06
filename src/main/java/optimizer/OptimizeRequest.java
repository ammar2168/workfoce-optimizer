package optimizer;


import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class OptimizeRequest {

    @NonNull
    ArrayList<Integer> rooms;

    @NonNull
    Integer senior;

    @NonNull
    Integer junior;
    
    
    
}
