package com.example.hrms.core.utilities.verification.mernis.concretes;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.core.utilities.verification.mernis.abstracts.MernisService;
import com.example.hrms.entities.concretes.SystemPersonnel;

public class MernisManager implements MernisService {

    @Override
    public Result checkIfRealPerson(SystemPersonnel systemPersonnel) throws Exception {

        
        return new SuccessResult();
    }
}
