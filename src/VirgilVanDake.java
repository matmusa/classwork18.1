import java.time.LocalDate;
import java.time.Period;

public class VirgilVanDake extends Sportsmen{
    public VirgilVanDake(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
    }
    @Override
    public String forward() {
        return null;
    }
    @Override
    public String goalKeeper() {
        return null;
    }

    @Override
    public String leftBack() {
        return null;
    }

    @Override
    public String centreBack() {
        return "\n  centre back- a player extreme defenders who act to the right of the center and are located almost on the edge of the field. ";

    }

    @Override
    public String rightBack() {
        return null;
    }

    @Override
    public String centreDevensiveiveBack() {
        return null;
    }

    @Override
    public String rightMidfielders() {
        return null;
    }

    @Override
    public String leftMidfielders() {
        return null;
    }

    @Override
    public String rightWinger() {
        return null;
    }

    @Override
    public String leftWinger() {
        return null;
    }
    Period ped = Period.between(getAge(), LocalDate.now());
    @Override
    public String toString() {
        return "\nname of centre back  : "+getFullName()+
                "\nage  :"+ped+
                "\n Height :"+getHeight()+
                "\nweight :"+getWeight()+
               centreBack()


                ;
    }
}
