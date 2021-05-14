package Concretes;

import Abstracts.CampaignService;
import Entities.Campaign;


public class CampaignManager  implements CampaignService{

	@Override
	public void save(Campaign campaign) {
		System.out.println("Campaign saved. " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated. " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted. " + campaign.getName());	
	}
}
