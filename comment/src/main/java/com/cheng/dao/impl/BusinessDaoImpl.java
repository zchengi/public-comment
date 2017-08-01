package com.cheng.dao.impl;

import com.cheng.bean.Business;
import com.cheng.dao.BusinessDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商户模块持久层实现
 * Created by cheng on 2017/7/22.
 */
@Repository
public class BusinessDaoImpl implements BusinessDao {

    @Autowired
    private BusinessDao businessesDao;

    @Override
    public List<Business> selectByPage(Business businessTemp) {
        return businessesDao.selectByPage(businessTemp);
    }
}