
import java.util.*;
import java.util.regex.*;

public class test2 {

    public static void main(String[] args) {
        String input = "abc123def456ghi789";
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(matcher.group());
        }
        System.out.println(numbers);
    }
}
// Output: [123, 456, 789]
