import java.util.ArrayList;

public class Converter {
    public static void main(String[] args) {
        System.out.print(convert("XI")+", ");
        System.out.print(convert("XIX")+", ");
        System.out.print(convert("XCV")+", ");
        System.out.print(convert("CXVI")+", ");
        System.out.print(convert("LXV")+", ");
        System.out.print(convert("LXXII")+", ");
        System.out.print(convert("LXXVII")+", ");
        System.out.print(convert("CXXIII")+", ");
        System.out.print(convert("CXXVII")+", ");
        System.out.print(convert("XIII")+", ");
        System.out.print(convert("XXIII")+", ");
        System.out.print(convert("CXLIX")+", ");
        //11, 19, 95, 116, 65, 72, 77, 123, 127, 13, 23, 149
    }

    private static int convert(String romanNumbers) {
        char[] arrNumbers = romanNumbers.toCharArray();
        ArrayList<Integer> arr = new ArrayList();
        int result = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == 'I') arr.add(1);
            if (arrNumbers[i] == 'V') arr.add(5);
            if (arrNumbers[i] == 'X') arr.add(10);
            if (arrNumbers[i] == 'L') arr.add(50);
            if (arrNumbers[i] == 'C') arr.add(100);
            if (arrNumbers[i] == 'D') arr.add(500);
            if (arrNumbers[i] == 'M') arr.add(1000);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size()-1) {
                result = result + arr.get(i);
                break;
            }
            if (arr.get(i) >= (arr.get(i+1))) {
                result = result + arr.get(i);
                if (arr.size()-1 == i+1) {
                    result = result + arr.get(i+1);
                    break;
                }
            } else {
                result = result + (arr.get(i+1)-arr.get(i));
                if (i == arr.size()-1) {
                    break;
                }
                i++;
            }
        }
        return result;
    }
}
