package com.myrest.adcampaign.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myrest.adcampaign.resource.AdCampaign;

public interface AdCampaignDao {

	void create(AdCampaign AdCampaign);

	List<AdCampaign> listAll();

}
