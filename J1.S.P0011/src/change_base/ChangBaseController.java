
package change_base;

/**
 *
 * @author Minh Thanh
 */
public class ChangBaseController {

    private final String HEXA = "0123456789ABCDEF";

    // convert other base to decimal
    public int otherToDecimal(String fromBase, int base) {
        
        int result = 0;
        int number;
        
        for (int i = 0; i < fromBase.length(); i++) {
            number = HEXA.indexOf(fromBase.charAt(i));
            result += number * Math.pow(base, fromBase.length() - i - 1);
        }
        
        return result;
    }

    public String decimalToOther(int decimal, int base) {

        StringBuilder result = new StringBuilder("");

        do {
            int hexadecimalValue = decimal % base;
            result.append(HEXA.charAt(hexadecimalValue));
            decimal /= base;
        } while (decimal != 0);

        return result.reverse().toString();
    }
}
