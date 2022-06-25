package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {/*email doğrulama sınıfı*/
    public static Result valid(String email,String email2){
        if(email == ""){
            return new ErrorResult("Email adresi boş olamaz");

        }
        Pattern  validEmailAdressRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
        /*patterm.case_insentive kural gereği büyük küçük harf kontrolünü es geçmeye yarıyor*/

        Matcher matcher =validEmailAdressRegex.matcher(email);

        boolean result = matcher.find();/*eşleşmenin olup olmadığını true veya false
        olarak dönderecektir.*/
        if(!result){
            return new ErrorResult("Email adresi yanlış formattadır.");
        }

        if (email.equals(email2)){
            return new ErrorResult("İki mail adresi birbirine eşit olamaz");
        }
        return new SuccessResult();

    }
}
