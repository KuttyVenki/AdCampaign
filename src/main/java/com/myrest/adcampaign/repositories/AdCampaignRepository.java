package com.myrest.adcampaign.repositories;

import com.myrest.adcampaign.resource.AdCampaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdCampaignRepository extends JpaRepository<AdCampaign,String> {


}
