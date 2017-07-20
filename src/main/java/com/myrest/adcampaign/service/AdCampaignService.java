package com.myrest.adcampaign.service;

import com.myrest.adcampaign.dao.impl.AdCampaignDaoImpl;
import com.myrest.adcampaign.resource.AdCampaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdCampaignService {

	@Autowired
	AdCampaignDaoImpl adCompaignDao;

	public List<AdCampaign> getAllAdCampaign() {
		return adCompaignDao.listAll();
	}
}
