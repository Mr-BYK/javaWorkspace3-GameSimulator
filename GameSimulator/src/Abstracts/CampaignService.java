package Abstracts;

import Entities.Campaign;

public interface CampaignService {
	void save (Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
