package com.jamie.rms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jamie
 *
 */
@Entity(name = "quantity_profile")
public class QuantityProfile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long quantityId;
	
	@Column(name = "partyId")
    private String partyId;
	
	@Column(name = "quantityUnit")
    private String quantityUnit;

	@Column(name = "createDate")
    private Date createDate;

	public Long getQuantityId() {
		return quantityId;
	}

	public void setQuantityId(Long quantityId) {
		this.quantityId = quantityId;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "QuantityProfile [quantityId=" + quantityId + ", partyId=" + partyId + ", quantityUnit=" + quantityUnit
				+ ", createDate=" + createDate + "]";
	}

	

	
	
	
	
	
}
