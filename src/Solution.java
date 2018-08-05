public class Solution {
    public static boolean validatePin(String pin) {

        if (pin.length() == 4 || pin.length() == 6) {
            try {
                Integer.parseInt(pin);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        validatePin("9.55");
    }
}
