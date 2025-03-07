
package Calculator;

import static java.lang.Double.NaN;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int division(int a, int b) {
        /*if (b != 0) {
            return a / b;
        } else {
            System.out.println("not possible divided by zero");
            //return double.NaN;
            return 0;
        }*/

      return a/b;

    }
}


// access_modifier return_type  method_name(parameters){
// return return_type_variable;
// }








