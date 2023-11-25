import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        String[] numbersArray = s.split("");
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            switch (numbersArray[i]) {
                case "I":
                    sum += 1;
                    break;
                case "V":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "I")) {
                        sum += 3;
                    } else {
                        sum += 5;
                    }
                    break;
                case "X":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "I")) {
                        sum += 8;
                    } else {
                        sum += 10;
                    }
                    break;
                case "L":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "X")) {
                        sum += 30;
                    } else {
                        sum += 50;
                    }
                    break;
                case "C":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "X")) {
                        sum += 80;
                    } else {
                        sum += 100;
                    }
                    break;
                case "D":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "C")) {
                        sum += 300;
                    } else {
                        sum += 500;
                    }
                    break;
                case "M":
                    if (i > 0 && Objects.equals(numbersArray[i - 1], "C")) {
                        sum += 800;
                    } else {
                        sum += 1000;
                    }
                    break;

            }
        }
        return sum;
    }
}
