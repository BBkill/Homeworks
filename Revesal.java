public class Revesal {
    private String string;

    Revesal(String string) {
        this.string = string;
    }

    public String reverseString() {
        String listWord[] = string.trim().split("\\s+");
        String answer = "";
        for (String itemString : listWord) {
            String temprary = "";
            for (int i = 0; i < itemString.length(); i++) {
                temprary = (itemString.charAt(i) + "") + temprary;
            }
            answer = answer + temprary + " ";
        }
        return answer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}