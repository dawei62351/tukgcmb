import javax.swing.text.DocumentFilter;

/**
 * @author Dawei
 * @create 2023-02-20-8:32 AM
 */
public class NumberOfSpins {
    public static int spinAround(String[] turns) {
        int rotation = 0;
        for (int i = 0; i < turns.length; i++) {
            if (turns[i] == "left") {
                rotation -= 90;
            } else if (turns[i] == "right") {
                rotation += 90;
            }
        }
        return Math.abs(rotation)/360;
    }
}
