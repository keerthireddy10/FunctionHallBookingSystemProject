package com.src.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.spring.dao.AdminDAO;
import com.src.spring.model.Admin;
import com.src.spring.service.AdminService;



	@Service
	@Transactional
	public class AdminServiceImpl implements AdminService {

		@Autowired
		private AdminDAO adminDAO;
		
		@Override
		public boolean validate(Admin admin) {
			
			return adminDAO.validate(admin);
		}

	}

