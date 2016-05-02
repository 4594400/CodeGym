package ua.in.codegym.lesson_022;


public class AddBinary {
    public static void main(String[] args) {
        System.out.println(add("100", "101"));
    }

    public static String add(String a, String b) {
        if (a == null || a.length() == 0)
            return b;
        if (b == null || b.length() == 0)
            return a;

        int pa = a.length() - 1;
        int pb = b.length() - 1;

        int flag = 0;
        StringBuilder sb = new StringBuilder();
        while (pa >= 0 || pb >= 0){
            int va = 0;
            int vb = 0;

            if (pa >= 0) {
                va = a.charAt(pa) == '0' ? 0 : 1;
                pa--;
            }
            if (pb >= 0) {
                vb = b.charAt(pb) == '0' ? 0 : 1;
                pb--;
            }

            int sum = va + vb + flag;
            if (sum >= 2) {
                sb.append(String.valueOf(sum - 2));
                flag = 1;
            } else {
                flag = 0;
                sb.append(String.valueOf(sum));
            }
        }

        if (flag == 1) {
            sb.append("1");
        }
        String reversed = sb.reverse().toString();
        return reversed;
    }
}
































///////////////////////////////////////////////////////////////////////////////

    /*public static String add(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int lastA = a.length() - 1;
        int lastB = b.length() - 1;
        int carry = 0;

        while (lastA >= 0 || lastB >= 0 || carry>0) {
            int num1 = lastA >= 0 ? a.charAt(lastA--) - '0' : 0;
            int num2 = lastB >= 0 ? b.charAt(lastB--) - '0' : 0;
            int current=(num1 + num2 + carry)%2;
            carry = (num1 + num2 + carry) / 2;
            stringBuilder.insert(0, current);
        }
        return stringBuilder.toString();
    }*/
//////////////////////////////////////////////////////////////////
    /*public static String add(String a, String b) {
        if (a == null || b == null) return "";
        int first = a.length() - 1;
        int second = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += a.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += b.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }*/

