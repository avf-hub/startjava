public class Calculator {
    private int number1;
    private int number2;
    private int result;
    private char sign;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        switch(sign) {
            case '+' :
                return number1 + number2;
            case '-' :
                return number1 - number2;
            case '*' :
                return number1 * number2;
            case '/' :
                return number1 / number2;
            case '^' :
                result = 1;
                for(int i = 0; i < number2; i++) {
                    result *= number1;
                }
                return result;
            case '%' :
                return number1 % number2;
            default :
                return result;
        }
    }
}