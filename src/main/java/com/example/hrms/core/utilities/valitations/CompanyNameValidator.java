package com.example.hrms.core.utilities.valitations;

import com.example.hrms.core.utilities.results.ErrorResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;

public class CompanyNameValidator {
    public static Result valid(String company_name){
        if(company_name == ""){
            return new ErrorResult("şirket ismi boş olamaz");
        }
        return new SuccessResult();
    }
}
