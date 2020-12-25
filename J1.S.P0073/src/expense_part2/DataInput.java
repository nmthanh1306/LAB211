/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense_part2;

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
                System.err.println("Please input in range [" + min + " - " + max + "]");
            }
        }
    }

    public double getInputDouble(String msg, String err, double min, double max) {
        while (true) {
            try {
                System.out.print(msg);
                double value = Integer.parseInt(sc.nextLine());
                if (value < min || value > max) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

    public String getInputString(String msg, String err) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println(err);
                continue;
            }
            return s;
        }
    }

    public String inputDate(String msg, String err) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = null;
        Date now = new Date();
//        sdf.setLenient(false);
        while (true) {
            try {
                System.out.print(msg);
                String s = sc.nextLine();
                date = sdf.parse(s);
                if (s.equals(sdf.format(date)) && !date.after(now)) {
                    return sdf.format(date);
                }
                if (!s.equals(sdf.format(date))) {
                    System.out.println("This date doesn't exist");
                }
                if (date.after(now) && s.equals(sdf.format(date))) {
                    System.out.println("Ngay này ko được vượt quá ngày hiện tại");
                }
            } catch (ParseException e) {
                System.err.println(err);
            }
        }
    }
}
