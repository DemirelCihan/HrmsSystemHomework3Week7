package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {
    public static Result valid(String phone_no){
        if (phone_no == ""){
            return new ErrorResult("telefon numarası 0 olamaz");
        }
        Pattern validPhoneNumberRegex = Pattern.compile("^/d(?:-/d{3}){3}/d$");
        Matcher matcher = validPhoneNumberRegex.matcher(phone_no);

        boolean result = matcher.find();

        if(!result){
            return new ErrorResult("Telefon numarası yanlış formattadır.");
        }

        return new SuccessResult();


    }
}
