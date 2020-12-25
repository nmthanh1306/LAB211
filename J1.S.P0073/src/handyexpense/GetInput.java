/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handyexpense;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class GetInput {

    private final Scanner sc = new Scanner(System.in);

    public int getInputChoice(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.println(msg);
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

    public double getInputDouble(String msg, String err, double min, double max) {
        while (true) {
            try {
                System.out.println(msg);
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
            System.out.println(msg);
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println(err);
                continue;
            }
            return s;
        }
    }

    public Date getDate(String msg, String err) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//        SimpleDateFormat sdf2 = new SimpleDateFormat("d-M-yyyy");

        Date date = null;
        while (true) {
            try {
                System.out.println(msg);
                String s = sc.nextLine();
                date = sdf.parse(s); // phan tich string thanh date
                Date now = new Date();
                if (s.equals(sdf.format(date))) {
                    return date;
                } else {
                    System.out.println("This date doesn't exist");
                }

                if (date.after(now)) {
                    System.out.println("Ngay nhap lon hon hien tai");
                    continue;
                }
            } catch (Exception e) {
                System.out.println(err);
            }
        }
    }

    public String getInputDate(String msg, String err) {
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
                if(!s.equals(sdf.format(date))){
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
