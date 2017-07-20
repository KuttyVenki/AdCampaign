package com.myrest.adcampaign.resource;

import javax.persistence.*;

@Entity
@Table(name = "adcampaign")
public class AdCampaign {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PARTNERID")
	private String partnerId;

	@Column(name = "DURATION")
	private int duration;

	@Column(name = "ADCONTENT")
	private String adContent;

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getAdContent() {
		return adContent;
	}

	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}
}
