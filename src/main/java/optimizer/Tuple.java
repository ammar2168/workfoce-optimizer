package optimizer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
/**
 * This is the data structure representing number of senior and junior cleaners 
 * @author ammar
 *
 */
@Data
public class Tuple {

    @JsonProperty("senior")
    int seniorCount;

    @JsonProperty("junior")
    int juniorCount;

    public int getSeniorCount() {
        return seniorCount;
    }

    public void setSeniorCount(int seniorCount) {
        this.seniorCount = seniorCount;
    }

    public int getJuniorCount() {
        return juniorCount;
    }

    public void setJuniorCount(int juniorCount) {
        this.juniorCount = juniorCount;
    }

    public Tuple(int seniorCount, int juniorCount) {
        this.seniorCount = seniorCount;
        this.juniorCount = juniorCount;
    }
}
