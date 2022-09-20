package com.yash.service;

import java.util.List;

import com.yash.model.Student;

public interface HomeService {

	Student savedata(Student s);

	List<Student> getdata();

	Student updatedata(int id, Student s);

	String deletedata(int id);

}
