import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class AlisonBecker extends Sportsmen{
    public AlisonBecker(String fullName, LocalDate age, double height, double weight) {
        super(fullName, age, height, weight);
    }

    @Override
    public String goalKeeper() {
        return "\n goal keeper -a player defending the team's goal, whose main goal is not to miss, leaving his goal locked. ";

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

    @Override
    public String forward() {
        return null;
    }

    Period ped = Period.between(getAge(), LocalDate.now());
    @Override
    public String toString() {
        return "\nname of goalkeeper : "+getFullName()+
                "\nage  :"+ped+
                "\n Height :"+getHeight()+
                "\nweight :"+getWeight()+
                goalKeeper()


                ;
    }
}
