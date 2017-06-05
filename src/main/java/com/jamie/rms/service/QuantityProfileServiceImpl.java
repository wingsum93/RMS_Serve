package com.jamie.rms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamie.rms.common.ResponseStatus;
import com.jamie.rms.dao.QuantityProfileDao;
import com.jamie.rms.model.QuantityProfile;
import com.jamie.rms.model.ResponseMessage;

@Service
public class QuantityProfileServiceImpl implements QuantityProfileService {

	@Autowired
	private QuantityProfileDao quantityProfileDao;
	
	@Override
	public List<QuantityProfile> findAll() {
		// TODO Auto-generated method stub
		return quantityProfileDao.findAll();
	}

	@Override
	public List<QuantityProfile> findByPartyId(String partyId) {
		// TODO Auto-generated method stub
		return quantityProfileDao.findByPartyId(partyId);
	}

	@Override
	public ResponseMessage delete(QuantityProfile quantityProfile) {
		// TODO Auto-generated method stub
		ResponseMessage r = new ResponseMessage();
		r.setRequest(quantityProfile.toString());
		// TODO Auto-generated method stub
		try{
			quantityProfileDao.delete(quantityProfile);
			r.setStatus(ResponseStatus.getSuccessful());
			r.setMessage("The record have been deleted");
		}catch (IllegalArgumentException e){
			r.setStatus(ResponseStatus.getFail());
			r.setMessage("The record do not appear into table");
		}
		return r;
	}

	@Override
	public QuantityProfile save(QuantityProfile quantityProfile) {
		// TODO Auto-generated method stub
		return quantityProfileDao.save(quantityProfile);
	}

	@Override
	public int updateQtyByQuantityIdAndPartyIdAndQtyUnit(QuantityProfile quantityProfile) {
		// TODO Auto-generated method stub
		Long qtyId = quantityProfile.getQuantityId();
		String qtyPartyId = quantityProfile.getPartyId();
		String qtyUnit = quantityProfile.getQuantityUnit();
		Date modifyTime = quantityProfile.getModifyTime();
		String modifyBy = quantityProfile.getModifyBy();
		

		return quantityProfileDao.updateQtyByQuantityIdAndPartyIdAndQtyUnit(qtyId, qtyPartyId, qtyUnit);
	}

}
