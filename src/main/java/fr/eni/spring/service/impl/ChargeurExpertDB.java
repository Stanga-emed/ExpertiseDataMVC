package fr.eni.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.spring.business.Expert;
import fr.eni.spring.dao.ExpertDao;

@Service("chargeurExpertDB")
public class ChargeurExpertDB implements IChargerExpert {
	@Autowired
	private ExpertDao expertDAO;
	
	@Override
	public List<Expert> chargerExperts() {
		return expertDAO.getAll();
	}

}
