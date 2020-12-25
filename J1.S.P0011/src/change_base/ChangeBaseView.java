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
public class ChangeBaseView {

    ChangBaseController ctrl = new ChangBaseController();

    // muon chuyen sang base nao khi chon xong menu
    public void displayOption(String sFromBase, String option1, String option2) {
        System.out.println("====== " + sFromBase + " convert! ======");
        System.out.println("1. Convert from " + sFromBase + " to " + option1);
        System.out.println("2. Convert from " + sFromBase + " to " + option2);
        System.out.println("3. Convert from " + sFromBase + " to " + sFromBase);
    }

    //chuyen 1 he sang binary
    public void convertFromBinary(String sBinary, int iDecimal, String sHexadecimal) {
        DataInput in = new DataInput();
        displayOption("binary", "decimal", "hexadecimal");
        int choice = in.inputChoice("Enter your choice: ", 1, 3);
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + iDecimal);
                break;
            case 2:
                System.out.println("Hexadecimal: " + sHexadecimal);
                break;
            case 3:
                System.out.println("Binary: " + sBinary);
                break;
        }
    }

    public void convertFromDecimal(String sDecimal, String sBinary, String sHexadecimal) {
        DataInput in = new DataInput();
        displayOption("decimal", "binary", "hexadecimal");
        int choice = in.inputChoice("Enter your choice: ", 1, 3);
        switch (choice) {
            case 1:
                System.out.println("Binary: " + sBinary);
                break;
            case 2:
                System.out.println("Hexadecimal: " + sHexadecimal);
                break;
            case 3:
                System.out.println("Decimal: " + sDecimal);
                break;
        }
    }

    public void convertFromHexadecimal(String sHexaDecimal, int iDecimal, String sBinary) {
        DataInput in = new DataInput();
        displayOption("hexadecimal", "decimal", "binary");
        int choice = in.inputChoice("Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                System.out.println("Decimal: " + iDecimal);
                break;
            case 2:
                System.out.println("Binary: " + sBinary);
                break;
            case 3:
                System.out.println("Hexadecimal: " + sHexaDecimal);
                break;
        }
    }
}
