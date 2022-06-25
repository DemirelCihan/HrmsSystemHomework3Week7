package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class FisrtNameValidator {
    public static Result valid(String first_name){
        if (first_name == "") {
            return new ErrorResult("isim bilgisi boş olamaz");
        }
        return new SuccessResult();
    }
}
