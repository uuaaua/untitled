package reviews.reviews3.review29;
import java.io.*;
import java.util.Scanner;

public class KeyInpt {
    public String readString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        try {
            inputStr = new Scanner(br).useDelimiter("\\A").next();
        } finally {
            System.out.println("ERROR: IOException");
        }
        return inputStr;
    }
}
