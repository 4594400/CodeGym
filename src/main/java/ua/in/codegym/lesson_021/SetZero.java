package ua.in.codegym.lesson_021;


public class SetZero {
    public static void main(String[] args) {
        System.out.println(set(-1,31));
    }

    public static int set(int num, int i) {
        char[] binary = Integer.toBinaryString(num).toCharArray();
        int count=1;
        for (int j = binary.length-1; j >=0  ; j--) {
            if (binary[j]=='1'&& count==i) {
                binary[j]='0';
            }
            count++;
        }
        return (int)Long.parseLong(new String(binary), 2);
    }
}
