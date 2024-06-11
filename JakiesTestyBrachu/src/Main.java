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
    }
}