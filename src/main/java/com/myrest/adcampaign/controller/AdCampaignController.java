package com.myrest.adcampaign.controller;

import java.util.List;

import com.myrest.adcampaign.repositories.AdCampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.myrest.adcampaign.resource.AdCampaign;
import com.myrest.adcampaign.service.AdCampaignService;

@RestController
@RequestMapping(value="/adCampaign")
public class AdCampaignController {
	
	@Autowired
	AdCampaignRepository adCampaignRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<AdCampaign> getAllAdCampaigns( ) {
		return adCampaignRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public AdCampaign postAdCampaign(@RequestBody AdCampaign adCampaign) {
		return adCampaignRepository.save(adCampaign);
	}
}
