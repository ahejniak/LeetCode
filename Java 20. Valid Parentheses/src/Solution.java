import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty() ||s.length()==1){
            return false;
        }
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String chart = String.valueOf(s.charAt(i));
            boolean ifStackNotEmpty = !stack.isEmpty();
            if (chart.equals("(") || chart.equals("{") || chart.equals("[")) {
                stack.push(chart);
            } else if (ifStackNotEmpty) {
                switch (chart) {
                    case ")" -> {
                        if (stack.peek().equals("(")) {
                            stack.pop();
                        } else return false;
                    }
                    case "}" -> {
                        if (stack.peek().equals("{")) {
                            stack.pop();
                        } else return false;
                    }
                    case "]" -> {
                        if (stack.peek().equals("[")) {
                            stack.pop();
                        } else return false;
                    }
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
