package optimizer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * Rest end point for work force optimization 
 * @author ammar
 *
 */
@RestController
public class OptimizerController {

    @PostMapping("/optimize")
    public List<Tuple> optimize(@RequestBody OptimizeRequest request){
        ArrayList<Tuple> response = new ArrayList<>();
        for(int workLoad : request.getRooms()){
            Optimizer optimizer = new Optimizer(request.getSenior(),request.getJunior(),workLoad);
            Tuple t = optimizer.optimize();
            response.add(t);
        }
        return response;
    }
}
