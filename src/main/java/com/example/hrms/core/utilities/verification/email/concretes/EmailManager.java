package com.example.hrms.core.utilities.verification.email.concretes;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.verification.email.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public Result verify(String email) {
        return new SuccessResult();
    }
}
