package com.arpit.main;

import com.arpit.model.superDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
adminDepartment admn=new adminDepartment();
hrDepartment hr1=new hrDepartment();
techDepartment tch = new techDepartment();
System.out.println(admn.departmentName());
System.out.println(admn.getTodaysWork());
System.out.println(admn.getWorkDeadline());
System.out.println(admn.isTodayAHoliday());
System.out.println();
System.out.println(hr1.departmentName());
System.out.println(hr1.getTodaysWork());
System.out.println(hr1.getWorkDeadline());
System.out.println(hr1.doActivity());
System.out.println(hr1.isTodayAHoliday());
System.out.println();
System.out.println(tch.departmentName());
System.out.println(tch.getTodaysWork());
System.out.println(tch.getWorkDeadline());
System.out.println(tch.getTechStackInformation());
System.out.println(tch.isTodayAHoliday());
}
	
}