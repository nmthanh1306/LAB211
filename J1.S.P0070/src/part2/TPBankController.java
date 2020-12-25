package part2;

import java.util.ResourceBundle;

/**
 *
 * @author Minh Thanh
 */
public class TPBankController {

    // return true if account have only 10 digits
    public boolean checkAccount(ResourceBundle bundle, String account) {
        return account.matches("^[0-9]{10}$");
    }

    // ^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$
    public boolean checkPassWord(ResourceBundle bundle, String password) {
        return password.matches("^(?=.*?[A-Za-z])(?=.*?[0-9]).{8,31}$");
    }
//    public boolean checkPassWord(ResourceBundle bundle, String password) {
//        boolean check1 = false;
//        boolean check2 = false;
//        char x;
//        if (password.length() >= 8 && password.length() <= 31) {
//            for (int i = 0; i < password.length(); i++) {
//                 x = password.charAt(i);
//                if (Character.isLetter(x)) {
//                    check1 = true;
//                }
//                if (Character.isLetter(x)) {
//                    check2 = true;
//                }
//                if (check1 && check2) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public boolean checkCaptcha(ResourceBundle bundle, String captcha, String captchaInput) {
        if (captchaInput.length() == 1) {
            if (captcha.contains(captchaInput)) {
                return true;
            }
        }
        return false;
    }
}
