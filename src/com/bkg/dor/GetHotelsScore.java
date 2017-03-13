package com.bkg.dor;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class GetHotelsScore {

    public static void main(String... args) {
        Score[] scores = new Score[6];
        scores[0] = new Score(1001, 501, 7);
        scores[1] = new Score(1001, 502, 7);
        scores[2] = new Score(1001, 503, 7);
        scores[3] = new Score(2001, 504, 10);
        scores[4] = new Score(3001, 505, 5);
        scores[5] = new Score(2001, 506, 5);

        printScores(get_hotels(scores, 5));
        printScores(get_hotels(scores, 7));
    }

    public static Score[] get_hotels(Score[] scores, int min_avg_score) {
        if (scores == null || scores.length == 0) return null;
        Set<Score> scoreSet = new HashSet<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == null) continue;
            if (scores[i].score >= min_avg_score)
                scoreSet.add(scores[i]);
        }
        return scoreSet.toArray(new Score[scoreSet.size()]);
    }

    public static void printScores(Score[] scores) {
        if (scores == null) return;
        for (int i = 0; i < scores.length; i++)
            System.out.printf("%s ", scores[i]);
        System.out.println();
    }

    static class Score {
        int hotel_id;
        int user_id;
        int score;

        Score(int hotel_id, int user_id, int score) {
            this.hotel_id = hotel_id;
            this.user_id = user_id;
            this.score = score;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Score scores = (Score) o;
            return hotel_id == scores.hotel_id;
        }

        @Override
        public int hashCode() {
            return hotel_id;
        }

        @Override
        public String toString() {
            return hotel_id + "";
        }
    }
}
