package com.arpit.main;

import com.arpit.model.superDepartment;

public class hrDepartment extends superDepartment{
	
	public String departmentName( ) {
		return("Hr Department");
	}
	public String getTodaysWork( ) {
		return("Fill today’s worksheet and mark your attendance");
	}
	public String getWorkDeadline( ) {
		return("Complete by EOD");
	}
	public String doActivity( ) {
		return("team Lunch");
	}	
}

