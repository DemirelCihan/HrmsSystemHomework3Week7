package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class BirthYearValidator {
    public static Result valid(int birth_year){
        if(String.valueOf(birth_year) == ""){
            return new ErrorResult("doğum yılı boş olamaz");
        }
        return new SuccessResult();
    }
}

