import java.time.LocalDate;
import java.time.Period;

public class TrentAlexsandrArnold extends Sportsmen {


    public TrentAlexsandrArnold(String fullName, LocalDate age, double height, double weight) {
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
        return null;
    }

    @Override
    public String rightBack() {
        return " \n right back -a player extreme defenders who act to the  left of the center and are located almost on the edge of the field.  ";

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
        return "\nname of right back  : " + getFullName() +
                "\nage  :" + ped +
                "\n Height :" + getHeight() +
                "\nweight :" + getWeight() +
                rightBack();
    }
}
