import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> citiDistanceMap = new HashMap<>();
        while (true){
            String cityName = scanner.nextLine();
            if(citiDistanceMap.containsKey(cityName)) {
               int kilometres = citiDistanceMap.get(cityName);
                System.out.println(kilometres);
            }
            else {
                System.out.println("Информация погороду отсутствует,введите ваше значение:");
                String line = scanner.nextLine();
                int kilometers = Integer.parseInt(line);
                citiDistanceMap.put(cityName,kilometers);

            }

        }
    }
}
