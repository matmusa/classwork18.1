import java.util.Arrays;

public class Liverpool {
    Sportsmen[]sportsmen;

    public Liverpool(Sportsmen[] sportsmen) {
        this.sportsmen = sportsmen;
    }

    @Override
    public String toString() {
        return "\n Liverpool " +
                "\nPlayers  " + Arrays.toString(sportsmen)
                ;
    }
}

