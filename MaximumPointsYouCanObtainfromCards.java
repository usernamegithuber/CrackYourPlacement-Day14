package CrackYourPlacementDay14;

public class MaximumPointsYouCanObtainfromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;

        // Calculate the sum of the first `k` cards
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        // Initialize the maximum score to this sum
        int maxScore = sum;

        // Use a sliding window to consider the rest of the cards
        for (int i = 0; i < k; i++) {
            sum = sum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxScore = Math.max(maxScore, sum);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        MaximumPointsYouCanObtainfromCards solution = new MaximumPointsYouCanObtainfromCards();
        int[] cardPoints = {1, 79, 80, 1, 1, 1, 200, 1};
        int k = 3;
        System.out.println(solution.maxScore(cardPoints, k)); // Expected output: 202
    }
}
