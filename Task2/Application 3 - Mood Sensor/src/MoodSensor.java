import java.util.Random;

public class MoodSensor {
    public static final char FACE_WITH_TEARS_OF_JOY = '\uF602';
    public static  final char SMILING_FACE_WITH_OPEN_MOUTH = '\uF604';
    public  static final char SMILING_FACE_WITH_HEARTSHAPED_EYES = '\uF60D';
    public static final char UNAMUSED_FACE = '\uF612';
    public static final char PENSIVE_FACE = '\uF614';
    public static final char ANGRY_FACE = '\uF620';
    public static final char EXPRESSIONLESS_FACE = '\uF611';

    public static char predictTheMood() {
        int moodNumber = new Random().nextInt(7);
        if (moodNumber == 1) {
            return (FACE_WITH_TEARS_OF_JOY);
        }
        if (moodNumber == 2) {
            return (SMILING_FACE_WITH_OPEN_MOUTH);
        }
        if (moodNumber == 3) {
            return (SMILING_FACE_WITH_HEARTSHAPED_EYES);
        }
        if (moodNumber == 4) {
            return (UNAMUSED_FACE);
        }
        if (moodNumber == 5) {
            return (PENSIVE_FACE);
        }
        if (moodNumber == 6) {
            return (ANGRY_FACE);
        }
        if (moodNumber == 7){
            return (EXPRESSIONLESS_FACE);
        }
    }
}
