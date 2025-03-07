package Calculator;

    public class Main{
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println("addition:" + c.add(57, 40));
        System.out.println("subtraction:"+ c.sub(15, 30));
        System.out.println("multiply"+ c.multiply(5, 10));
        System.out.println("division:" + c.division(5, 0));
    }
    }

