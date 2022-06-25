package com.example.hrms.core.utilities.verification.mernis.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.SystemPersonnel;

public interface MernisService {
   public Result checkIfRealPerson(SystemPersonnel systemPersonnel) throws Exception;


}
