public class Solution {

    public static String changeFormatNumber(String number) {
        // write code here
        for(int i=0;i<number.length();++i){
            if(i==0&&number.charAt(i)=='-'||number.charAt(i)=='+')
                continue;
            if(!Character.isDigit(number.charAt(i)))
                return "INPUTERROR";
        }
        Long value = Long.valueOf(number);
        int maxNum = (int) Math.pow(2,15)-1;
        int min = (int) -Math.pow(2,15);
        if (value > maxNum || value < min) {
            return "NODATA";
        }
        StringBuilder str = new StringBuilder(Integer.toBinaryString(Integer.parseInt(number)));
        str.reverse();
        while (str.length() < 16)
            str.append("0");
        str.reverse();
        return str.toString() + "," + tenToSisteen(str.toString());
    }

    public static String tenToSisteen(String binary) {
        int[] str = new int[4];
        for (int i = 4; i <= 16; i += 4) {
            for (int j = i - 4; j < i; ++j) {
                str[i / 4 - 1] = str[i / 4 - 1] * 2 + Integer.valueOf(binary.charAt(j) - '0');
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; ++i) {
            if (str[i] < 10) {
                result.append(str[i]);
            } else {
                result.append((char) ('A' + str[i] - 10));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(String.valueOf((int)Math.pow(2, 15)));
        System.out.println(changeFormatNumber(String.valueOf((int)-Math.pow(2, 15))));

    }

    // public static String tenToBinary(Long number) {
    // StringBuilder str = new StringBuilder();
    // while (number > 0) {
    // str.append(number % 2);
    // number >>= 1;
    // }
    // while (str.length() < 16)
    // str.append("0");
    // return str.reverse().toString();
    // }

    // public static String tenToBinaryN(Long number) {
    // int[] d = new int[16];
    // for (int i = 0; number > 0; number >>= 1) {
    // d[i++] = (int) (number % 2);
    // }
    // d[15] = 1;
    // for (int i = 0; i < 15; ++i)
    // d[i] = d[i] == 1 ? 0 : 1;
    // int flag = 0;
    // for (int i = 0; i < 15; ++i) {
    // if (flag + d[i] > 1) {
    // flag = 1;
    // d[i] = 0;
    // } else {
    // d[i] = d[i] + flag;
    // }
    // }
    // StringBuilder str = new StringBuilder();
    // for (int i : d)
    // str.append(i);
    // return str.reverse().toString();
    // }

}