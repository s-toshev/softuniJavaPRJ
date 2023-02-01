package finalExam;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> flwrs = new TreeMap<>();

        String text;
        while (!"Log out".equals(text = scanner.nextLine())) {
            String[] data = text.split(": ");

            String inputCommand = data[0];
            String userName = data[1];
            switch (inputCommand) {
                case "New follower":
                    if (!flwrs.containsKey(userName)) {
                        flwrs.put(userName, 0);
                    }
                    break;
                case "Like":
                    int countLikes = Integer.parseInt(data[2]);

                    if (!flwrs.containsKey(userName)) {
                        flwrs.put(userName, countLikes);
                    } else {
                        flwrs.put(userName, flwrs.get(userName) + countLikes);
                    }
                    break;
                case "Comment":
                    if (!flwrs.containsKey(userName)) {
                        flwrs.put(userName, 1);
                    } else {
                        flwrs.put(userName, flwrs.get(userName) + 1);
                    }
                    break;
                case "Blocked":
                    if (flwrs.containsKey(userName)) {
                        flwrs.remove(userName);
                    } else {
                        System.out.printf("%s doesn't exist.%n", userName);
                    }
                    break;
            }
        }

        System.out.printf("%d followers%n", flwrs.size());
        flwrs.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry::getKey))
                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
    }
}
