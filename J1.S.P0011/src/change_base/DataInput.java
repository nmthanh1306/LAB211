/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change_base;

import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class DataInput {

    private final Scanner sc = new Scanner(System.in);

    public int inputChoice(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println("Please input " + min + " - " + max);
            }
        }
    }

    //xet xem trong tung vi tri ng dung co nhap dung kieu cua base k
    private final String[] VALID_FOR_BASE = {"", "", "^[0-1]+$", "", "", "", "",
        "", "", "", "\\d+", "", "", "", "", "", "^[0-9A-F]+$"};

    //xet tung phan tu tuong ung vs ten cua base do
    private final String[] NAME_BASE = {"", "", "binary", "", "", "", "",
        "", "", "", "decimal", "", "", "", "", "", "hexadecimal"};

    public String inputBase(int base) {
        String numberic;
        while(true) {
            System.out.print("Input " + NAME_BASE[base] + ": ");
            numberic = sc.nextLine();
            if (numberic.matches(VALID_FOR_BASE[base])) {
                return numberic;
            } else if (base == 2) {
                System.out.println("Invalid base, binary must be 0 or 1");
            } else if (base == 10) {
                System.out.println("Invalid base, decimal must be positive number");
            } else if (base == 16) {
                System.out.println("Invalid base, hexadecimal must be 0-9 or A-F");
            }
        } 
    }
}
