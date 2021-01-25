import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTask {

    public static String generateNum(List<Integer> numbers) {

        List<Integer> l1 = new ArrayList<>();

        numbers.stream().map(x -> {
            int index2 = numbers.indexOf(x);
            int index1 = index2 - 1;
            if (index1 > 0) {
                int previousNum = numbers.get(index1);
                if (x - previousNum < Math.abs(2)) {
                    return x;
                } else {
                    l1.add(previousNum + 1);
                }
            } return x;}
        ).count();

        if(numbers.get(0) != 1) {
            return "001";
        }
        if(l1.size() == 0) {
            Integer e = numbers.get(numbers.size() - 1) + 1;
            return toConcat(e);
        }
        Integer result = l1.get(0);
        return toConcat(result);
    }

    public static String toConcat(Integer t) {
        if (t > 99) {
            return t.toString();
        } else if (t > 9) {
            return "0" + t;
        } else return "00" + t;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 5);

        System.out.println("Номер проекта: " + TestTask.generateNum(numbers));
    }
}
