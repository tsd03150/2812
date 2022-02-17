import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        String str = kb.next();
        char[] ch = new char[str.length()];

        for (int i = 0; i < n; i++) {
            ch[i] = str.charAt(i);
        }

        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char now = ch[i];

            while (cnt < m && !stack.isEmpty() && stack.peek() < now) {
                stack.pop();
                cnt++;
            }
            stack.push(now);
        }

        for (int i = 0; i < n - m; i++) {
            System.out.print(stack.get(i));
        }

    }


}