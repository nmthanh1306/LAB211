/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagement;

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

    public int checkInputInt(String msg, String err, String err2, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int value = Integer.parseInt(sc.nextLine().trim());
                if (value < min || value > max) {
                    System.err.println(err);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println(err2);
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
                if (s.equals(sdf.format(date)) || s.equals(sdf2.format(date))){
                    return sdf.format(date);
                } else {
                    System.out.println("This date doesn't exist");
                }
//                Date now = new Date();
//                if(date.after(now)){
//                    System.out.println("Ngay này ko được vượt quá ngày hiện tại");
//                    continue;
//                }
            } catch (ParseException e) {
                System.err.println(err);
            }
        }
    }
    public String changeTaskType(int number) {
        String s = "";
        switch (number) {
            case 1:
                s = "Code";
                break;
            case 2:
                s = "Test";
                break;
            case 3:
                s = "Design";
                break;
            case 4:
                s = "Review";
                break;
        }
        return s;
    }

}
