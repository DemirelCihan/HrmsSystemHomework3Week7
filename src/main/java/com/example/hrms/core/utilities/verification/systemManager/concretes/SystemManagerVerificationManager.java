package com.example.hrms.core.utilities.verification.systemManager.concretes;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.verification.systemManager.abstracts.SystemManagerVerificationService;

public class SystemManagerVerificationManager implements SystemManagerVerificationService {
    @Override
    public Result verify(String systemManger) {
        return new SuccessResult();
    }
}
