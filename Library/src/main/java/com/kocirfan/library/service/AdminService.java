package com.kocirfan.library.service;

import com.kocirfan.library.dto.AdminDto;
import com.kocirfan.library.model.Admin;

public interface AdminService {

    Admin findByUsername(String username);
    Admin save(AdminDto adminDto);
}
