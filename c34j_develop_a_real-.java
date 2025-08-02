import java.util.ArrayList;
import java.util.List;

public class GamePrototypeAnalyzer {

    // Game prototype data structure
    public static class GamePrototype {
        String title;
        int playerCount;
        double averageRating;
        List<String> genres;
        List<String> platforms;

        public GamePrototype(String title, int playerCount, double averageRating, List<String> genres, List<String> platforms) {
            this.title = title;
            this.playerCount = playerCount;
            this.averageRating = averageRating;
            this.genres = genres;
            this.platforms = platforms;
        }
    }

    // Real-time game prototype analyzer
    public static class RealTimeAnalyzer {
        private List<GamePrototype> prototypes;

        public RealTimeAnalyzer() {
            this.prototypes = new ArrayList<>();
        }

        public void addPrototype(GamePrototype prototype) {
            this.prototypes.add(prototype);
        }

        public void analyze() {
            for (GamePrototype prototype : prototypes) {
                System.out.println("Analyzing: " + prototype.title);
                analyzePlayerCount(prototype.playerCount);
                analyzeAverageRating(prototype.averageRating);
                analyzeGenres(prototype.genres);
                analyzePlatforms(prototype.platforms);
            }
        }

        private void analyzePlayerCount(int playerCount) {
            if (playerCount < 1000) {
                System.out.println("Player count is low.");
            } else if (playerCount < 10000) {
                System.out.println("Player count is moderate.");
            } else {
                System.out.println("Player count is high.");
            }
        }

        private void analyzeAverageRating(double averageRating) {
            if (averageRating < 3.0) {
                System.out.println("Average rating is low.");
            } else if (averageRating < 4.0) {
                System.out.println("Average rating is moderate.");
            } else {
                System.out.println("Average rating is high.");
            }
        }

        private void analyzeGenres(List<String> genres) {
            if (genres.contains("Action")) {
                System.out.println("Action genre detected.");
            }
            if (genres.contains("Adventure")) {
                System.out.println("Adventure genre detected.");
            }
            // Add more genre analysis here
        }

        private void analyzePlatforms(List<String> platforms) {
            if (platforms.contains("PC")) {
                System.out.println("PC platform detected.");
            }
            if (platforms.contains("Console")) {
                System.out.println("Console platform detected.");
            }
            // Add more platform analysis here
        }
    }

    public static void main(String[] args) {
        RealTimeAnalyzer analyzer = new RealTimeAnalyzer();

        GamePrototype prototype1 = new GamePrototype("Game 1", 5000, 4.2, List.of("Action", "Adventure"), List.of("PC", "Console"));
        GamePrototype prototype2 = new GamePrototype("Game 2", 2000, 3.8, List.of("Strategy"), List.of("Mobile"));

        analyzer.addPrototype(prototype1);
        analyzer.addPrototype(prototype2);

        analyzer.analyze();
    }
}