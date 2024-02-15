package com.studies.model.services;

import java.util.List;

import com.studies.model.dao.DaoFactory;
import com.studies.model.dao.DepartmentDao;
import com.studies.model.entities.Department;

public class DepartmentService {
    
    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }
}
