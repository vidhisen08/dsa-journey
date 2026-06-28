package Strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }
        String d = s.concat(s);
        return d.contains(goal);

    }
}
