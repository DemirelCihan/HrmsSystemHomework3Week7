package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class WebAdressValidator {
    public static Result valid(String web_adress){
        if(web_adress == ""){
            return new ErrorResult("web adresi alanı boş olamaz");
        }
        return new SuccessResult();
    }

}
