package com.yash.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.Student;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService  {

	@Autowired
	HomeRepository hr;
	
	@Override
	public Student savedata(Student s) {
		// TODO Auto-generated method stub
		return hr.save(s) ;
	}

	@Override
	public List<Student> getdata() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public Student updatedata(int id, Student s) {
		// TODO Auto-generated method stuby
		
		s.setId(id);
		
		return hr.save(s);
	}

	@Override
	public String deletedata(int id) {
		// TODO Auto-generated method stub
		
		hr.deleteById(id);
		
		return "deleted";
	}

}
