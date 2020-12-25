/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class DataInput {

    private final Scanner sc = new Scanner(System.in);

    public int checkInputInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int value = Integer.parseInt(sc.nextLine().trim());
                if (value < min || value > max) {
                    System.out.println("Please input in range [" + min + " - " + max + "]");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Please input a digit");
            }
        }
    }

    public String checkInputString(String msg, String err) {
        while (true) {
            System.out.print(msg);
            String value = sc.nextLine().trim();
            if (value.isEmpty()) {
                System.err.println(err);
                continue;
            }
            return value;
        }
    }

    public double checkInputTimeDouble(String msg, String err, double min, double max) {
        while (true) {
            try {
                System.out.print(msg);
                double value = Double.parseDouble(sc.nextLine().trim());
                if ((value >= min && value <= max) && (value % 0.5 == 0)) {
                    return value;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

//    // check regex so chia het cho 5
//    public double inputTime(String msg, double min, double max) {
//        double value = 0;
//        while (true) {
//            System.out.print(msg);
//            String number = sc.nextLine();
//            if (number.matches("^[0-9]+$") || number.matches("^[0-9]+.[05][0]*$")) {
//                value = Double.parseDouble(number);
//                if (value >= min && value <= max) {
//                    break;
//                } else {
//                    System.out.println("Please input in range [" + min + " - " + max + "]");
//                }
//            } else {
//                System.out.println("Invalid, re-enter");
//            }
//        }
//        return value;
//    }

    public String checkInputDate(String msg, String err) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("d-M-yyyy");
        Date date = null;
//        sdf.setLenient(false);
        while (true) {
            try {
                System.out.print(msg);
                String s = sc.nextLine();
                date = sdf.parse(s);
                if (s.equals(sdf.format(date)) || s.equals(sdf2.format(date))) {
                    return sdf.format(date);
                } else {
                    System.out.println("This date doesn't exist");
                }
            } catch (ParseException e) {
                System.err.println(err);
            }
        }
    }
}
