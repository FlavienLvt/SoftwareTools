package sk.fri;

public class Rating {
    public char determineResultGrade(int points) {
        if (points < 0 || points > 100) {
            throw new IllegalArgumentException("Points must be between 0 and 100");
        }
        if (points >= 93) return 'A';
        if (points >= 85) return 'B';
        if (points >= 77) return 'C';
        if (points >= 69) return 'D';
        if (points >= 61) return 'E';
        return 'F';
    }
}