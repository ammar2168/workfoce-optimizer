package optimizer;

import java.util.HashMap;

/**
 * Optimizer optimizes the workload
 * @author ammar
 *
 */

public class Optimizer {

    int seniorCapacity;
    int juniorCapacity;
    int workLoad;

    HashMap<Integer,Tuple> lookUpTable = new HashMap<>();
    public Optimizer(int seniorCapacity, int juniorCapacity, int workLoad) {
        this.seniorCapacity = seniorCapacity;
        this.juniorCapacity = juniorCapacity;
        this.workLoad = workLoad;
    }

    public Tuple optimize(){
        return optimize(workLoad,seniorCapacity,juniorCapacity);
    }

    private Tuple optimize(int workLoad, int seniorCapacity, int juniorCapacity){


        if(workLoad <= seniorCapacity){
            Tuple t = new Tuple(1,0);
            lookUpTable.put(workLoad,t);
        }
        Tuple _t = lookUpTable.get(workLoad);
        if(_t != null)
            return _t;
        Tuple t1 = optimize(workLoad-seniorCapacity,seniorCapacity,juniorCapacity);
        Tuple t2 = optimize(workLoad - juniorCapacity,seniorCapacity,juniorCapacity);
        int t1Capacity = t1.getJuniorCount() * juniorCapacity + (t1.getSeniorCount()+1) * seniorCapacity;
        int t2Capacity = (t2.getJuniorCount() + 1) * juniorCapacity + t2.getSeniorCount() * seniorCapacity;
        if(t1Capacity <  t2Capacity) {
            Tuple t = new Tuple(t1.getSeniorCount() + 1, t1.getJuniorCount());
            lookUpTable.put(workLoad,t);
            return t;
        }
        else {
            Tuple t =new Tuple(t2.getSeniorCount(), t2.getJuniorCount() + 1);
            lookUpTable.put(workLoad, t);
            return t;
        }
    }
}
