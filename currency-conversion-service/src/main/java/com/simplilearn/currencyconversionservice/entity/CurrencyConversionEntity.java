package com.simplilearn.currencyconversionservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY_CONVERTED_VALUE")
public class CurrencyConversionEntity {

	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "CONVERSION_FROM")
	private String from;
	
	@Column(name = "CONVERSION_TO")
	private String to;
	
	@Column(name = "CONVERSION_MULTIPLE")
	private BigDecimal conversionMultiple;
	
	@Column(name = "QUANTITY")
	private BigDecimal quanity;
	
	@Column(name = "TOTAL_CALCULATED_AMOUNT")
	private BigDecimal totalCalculatedAmount;

	public CurrencyConversionEntity() {
		super();
	}

	public CurrencyConversionEntity(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quanity,
			BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quanity = quanity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuanity() {
		return quanity;
	}

	public void setQuanity(BigDecimal quanity) {
		this.quanity = quanity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

}
