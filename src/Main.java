import com.kapitanov.Treet;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Treet treet = new Treet(
                "Yani Kapitanov",
                "This is just a description.",
                new Date(576084477000l)
        );
        System.out.printf("This is a new treet: %s %n", treet);

        for (String word : treet.getWords()) {
            System.out.println(word);
        }
    }
}
