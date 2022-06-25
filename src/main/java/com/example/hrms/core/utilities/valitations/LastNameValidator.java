package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class LastNameValidator {
    public static Result valid(String last_name){
        if(last_name == ""){
            return new ErrorResult("soyisim bilgisi boş olamaz");
        }
        return new SuccessResult();
    }
}
