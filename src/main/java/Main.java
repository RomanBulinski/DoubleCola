import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String WhoIsNext(String[] names, int n) {

        int peopleUmonut = names.length;
        if (n < peopleUmonut) {
            return names[n - 1];
        } else {
            int sequnce = 1;
            int sumPeople = peopleUmonut;
            int lastPortion = peopleUmonut;

            while ((sumPeople + (lastPortion * 2)) < n) {
                lastPortion *= 2;
                sumPeople += lastPortion;
                sequnce *= 2;
            }
            int rest = n - sumPeople;

            if (rest < (sequnce * 2)) {
                return names[0];
            } else if (rest % (sequnce * 2) == 0) {
                return names[(int) (rest / (sequnce * 2)) - 1];
            } else {
                return names[(int) (rest / (sequnce * 2))];
            }

        }
    }

}
