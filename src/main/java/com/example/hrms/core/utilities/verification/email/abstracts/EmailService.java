package com.example.hrms.core.utilities.verification.email.abstracts;

import com.example.hrms.core.utilities.results.Result;

public interface EmailService {
    Result verify(String email);
}
