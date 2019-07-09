package com.fwy.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fwy.dao.StudentMapper;
import com.fwy.model.Student;

@Service
public class TestService {
	@Resource
	private StudentMapper stuMapper;

	public void add(Student stu) {
			stuMapper.insertSelective(stu);
	}
}
