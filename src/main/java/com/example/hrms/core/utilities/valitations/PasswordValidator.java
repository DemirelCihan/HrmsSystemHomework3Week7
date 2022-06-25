package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class PasswordValidator {
    public static Result valid(String user_password, String user_password1){
        if (user_password == ""){
            return new ErrorResult("Şifre boş olamaz");
        }
        if(user_password1 == ""){
            return new ErrorResult("tekrar girilen şifre boş olamaz");
        }
        if(user_password.equals(user_password1)){
            return new ErrorResult("şifreler tekrar edemez.");
        }
        return new SuccessResult();
    }
}
