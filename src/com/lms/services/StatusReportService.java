package com.lms.services;

import java.sql.SQLException;
import java.util.List;

import com.lms.daoimplementations.StatusReportDaoImplementation;
import com.lms.daointerfaces.StatusReportDao;

public class StatusReportService {
	public List generateStatusReport() throws ClassNotFoundException, SQLException{
		StatusReportDao statusReportDao=new StatusReportDaoImplementation();
		return statusReportDao.generateStatusReport();
	}
}
