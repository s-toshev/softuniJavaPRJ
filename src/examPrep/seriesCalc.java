package examPrep;

import java.util.Scanner;

public class seriesCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String showName = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double timeEpisode = Double.parseDouble(scanner.nextLine());

        double adTime = timeEpisode * 0.20;
        double episodeTimePlusAd = timeEpisode + adTime;
        double specialTimeEpisodes = seasonsCount * 10;

        double totalTime = episodeTimePlusAd * episodesCount * seasonsCount + specialTimeEpisodes;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", showName, Math.floor(totalTime));
    }
}

