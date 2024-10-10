import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Alice", 95);
        studentMarks.put("Bob", 88);
        studentMarks.put("Charlie", 92);

        System.out.println("Marks of Alice: " + studentMarks.get("Alice"));
    }
}