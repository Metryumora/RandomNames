import java.util.List;
import java.util.Random;

/**
 * Created by Supreme on 14.01.2017.
 */

public class NameGenerator {

    private static List<String> maleFirstNames = FileWorker.readAllLines("malenames.txt");

    private static List<String> femaleFirstNames = FileWorker.readAllLines("femalenames.txt");

    private static List<String> surnames = FileWorker.readAllLines("surnames.txt");

    public static String getMaleName() {
        Random r = new Random();
        return maleFirstNames.get(r.nextInt(maleFirstNames.size()));
    }

    public static String getFemaleName() {
        Random r = new Random();
        return femaleFirstNames.get(r.nextInt(femaleFirstNames.size()));
    }

    public static String getSurname() {
        Random r = new Random();
        return surnames.get(r.nextInt(surnames.size()));
    }

    public static String getFullMaleName() {
        return getMaleName() + " " + getSurname();
    }

    public static String getFullFemaleName() {
        return getFemaleName() + " " + getSurname();
    }

    public static String getFullName(char gender) {
        if (gender == 'm' || gender == 'M') {
            return getFullMaleName();
        }
        if (gender == 'f' || gender == 'F') {
            return getFullFemaleName();
        }
        return null;
    }
}
