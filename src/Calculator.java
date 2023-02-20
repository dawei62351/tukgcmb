/**
 * @author Dawei
 * @create 2023-02-20-8:30 AM
 */
public class Calculator {
        public static Object basicCalculator(int a, String o, int b) {
            if(o == "+") return a + b;
            if(o == "-") return a - b;
            if(o == "/" && b != 0) return a / b;
            if(o == "*") return a * b;
            else return null;
        }
}
