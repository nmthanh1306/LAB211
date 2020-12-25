/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change_base;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ChangeBaseView view = new ChangeBaseView();
        DataInput in = new DataInput();
        ChangBaseController ctrl = new ChangBaseController();
        String sBinary, sHexadecimal;
        int iDecimal;

        while (true) {
            displayMenu();
            int choice = in.inputChoice("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    sBinary = in.inputBase(2);
                    iDecimal = ctrl.otherToDecimal(sBinary, 2); // binary to decimal
                    sHexadecimal = ctrl.decimalToOther(iDecimal, 16); // dec to hex
                    view.convertFromBinary(sBinary, iDecimal, sHexadecimal);
                    break;
                case 2:

                    String sDecimal = in.inputBase(10);
                    iDecimal = Integer.parseInt(sDecimal);
                    sBinary = ctrl.decimalToOther(iDecimal, 2);
                    sHexadecimal = ctrl.decimalToOther(iDecimal, 16); // dec to hex
                    view.convertFromDecimal(sDecimal, sBinary, sHexadecimal);
                    break;
                case 3:
                    sHexadecimal = in.inputBase(16);
                    iDecimal = ctrl.otherToDecimal(sHexadecimal, 16);
                    sBinary = ctrl.decimalToOther(iDecimal, 2);
                    view.convertFromHexadecimal(sHexadecimal, iDecimal, sBinary);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    private static void displayMenu() {
        System.out.println("====== Change Base ======");
        System.out.println("1. Binary");
        System.out.println("2. Decimal");
        System.out.println("3. Hexadecimal ");
    }

}
