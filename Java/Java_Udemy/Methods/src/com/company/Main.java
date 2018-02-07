package com.company;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your high score was " + highScore);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Akil", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Aline", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Craig", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public  static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) return 1;
        else if (playerScore >= 500 && playerScore < 1000) return 2;
        else if (playerScore >= 100 && playerScore < 500) return 3;
        else return 4;
    }
}


//Create a method called displayHighScorePosition
//parameters: str(playersname), int(position)
//Output: <playersname> + 'managed to get into position ' + position + 'on the high score table'
//return: none

//Create a 2nd method called calculateHighScorePostiion
//parameters: int player score
//return: int position
// {
//    1 if the score is > 1000
//    2 if the score is >500 and < 1000
//    3 if the score is >100 and < 500
//    4 in all other cases
//    call both methods and display the results of the following
//        }








