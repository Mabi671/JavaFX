import java.util.*;

public class Main {
    public static void main(String[] args) {

        String binaryString = "01001110";
        int wynik = 0;
        for (int i = 7; i > 0; i--) {
            char har = binaryString.charAt(i);
            int num = Integer.parseInt(String.valueOf(har));
            wynik += (int) (Math.pow(2, i) * num);
        }
        System.out.println(wynik);
        int number = 114;
        List<Integer> squares = new ArrayList<>();
        int x = -1;
        StringBuilder sb = new StringBuilder();
        while(Math.pow(2, x) < number){
            x += 1;
            squares.add((int) Math.pow(2, x));
            sb.append(0);
        }
        String answer = sb.toString();
        while (number > 0)
        {
            for(int i = 0; i < squares.size(); i++){
                if((squares.get(i) * 2) > number)
                {
                    number -= squares.get(i);
                    answer = answer.substring(0, i)
                            + "1"
                            + answer.substring(i + 1);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}