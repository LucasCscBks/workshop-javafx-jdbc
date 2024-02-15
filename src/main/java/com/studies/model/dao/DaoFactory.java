package com.studies.model.dao;

import com.studies.db.DB;
import com.studies.model.dao.impl.DepartmentDaoJDBC;
import com.studies.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
