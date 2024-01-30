import java.beans.PropertyEditorManager;

public class Main extends Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String roman = "MCMXCIV";
        System.out.println(solution.romanToInt(roman));
    }
}
