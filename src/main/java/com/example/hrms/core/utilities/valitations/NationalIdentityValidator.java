package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class NationalIdentityValidator {
    public static Result valid(String identification_no){
        if(identification_no == ""){
            return new ErrorResult("kimlik bilgisi boş olamaz");
        }
        return new SuccessResult();
    }
}
