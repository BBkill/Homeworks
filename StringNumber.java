import java.util.*;

public class StringNumber {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            String fstringNumber = input.nextLine();
            String sstringNumber = input.nextLine();
            Map<Integer, Integer> numMap = new HashMap<>();
            String firstlistNumber[] = fstringNumber.trim().split("\\s+");
            String secondlistNumber[] = sstringNumber.trim().split("\\s+");
        try {
            for (String number : firstlistNumber) {
                if (numMap.containsKey(Integer.parseInt(number))) {
                    numMap.put(Integer.parseInt(number), numMap.get(Integer.parseInt(number)) + 1);
                } else {
                    numMap.put(Integer.parseInt(number), 1);
                }
            }
        
            for (String number : secondlistNumber) {
                if (numMap.containsKey(Integer.parseInt(number))) {
                    numMap.remove(Integer.parseInt(number));
                }
            }
            System.out.println("các phần tử lặp lại trong dãy thứ nhất mà không xuất hiện trong dãy thứ hai la: ");
            for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
                if (entry.getValue() >= 2)
                    System.out.println(entry.getKey());
            }
        } catch (NumberFormatException a) {
          
            System.out.println("đầu vào sai: "+a.getMessage());
        }
        
    }
}