import java.util.Random;

public class MoodSensor {

    public static void predictTheMood() {
        int moodNumber = new Random().nextInt(8);
        if (moodNumber == 1) {
            System.out.println("You are crying for joy just now. " + '\uF602');
        } else if (moodNumber == 2) {
            System.out.println("You are happy just now. " + '\uF604');
        } else if (moodNumber== 3) {
            System.out.println("You are holy man today. " + '\uF607');
        } else if (moodNumber == 4) {
            System.out.println("You are lucky devil today. " + '\uF608');
        } else if (moodNumber == 5) {
            System.out.println("You are savouring delicious food just now. " +  '\uF60B');
        } else if (moodNumber == 6) {
            System.out.println("You are in love with this program. " + '\uF60D');
        } else if (moodNumber == 7) {
            System.out.println("You are not very happy just now. " + '\uF612');
        }  else if (moodNumber == 8) {
            System.out.println("You are pensive today. " + '\uF614');
        } else if (moodNumber == 9) {
            System.out.println("You are angry just now. Don't be angry, everything will go well. " + '\uF620');
        } else if (moodNumber == 10) {
            System.out.println("You are disappointed now. " + '\uF61E');
        } else {
            System.out.println("You are expressionless now. " + '\uF611');
        }
    }
}
