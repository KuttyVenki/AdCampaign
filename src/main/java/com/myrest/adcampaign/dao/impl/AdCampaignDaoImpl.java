package com.myrest.adcampaign.dao.impl;


import com.myrest.adcampaign.dao.AdCampaignDao;
import com.myrest.adcampaign.resource.AdCampaign;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdCampaignDaoImpl implements AdCampaignDao{

    SessionFactory sessionFactory;


    @Override
    public void create(AdCampaign AdCampaign) {

    }

    @Override
    public List<AdCampaign> listAll() {
        Session session = this.sessionFactory.openSession();
        List<AdCampaign> personList = session.createQuery("from AdCompaign").list();

        return personList;
    }
}
