package com.studies.model.services;

import java.util.List;

import com.studies.model.dao.DaoFactory;
import com.studies.model.dao.SellerDao;
import com.studies.model.entities.Seller;

public class SellerService {
    
    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }
}
