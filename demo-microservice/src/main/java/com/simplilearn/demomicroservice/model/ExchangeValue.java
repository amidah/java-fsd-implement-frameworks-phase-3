package com.simplilearn.demomicroservice.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE_VALUE")
public class ExchangeValue {
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "CONVERSION_FROM")
	private String from;
	@Column(name = "CONVERSION_TO")
	private String to;
	@Column(name = "CONVERSION_MULTIPLE")
	private BigDecimal conversionMultiple;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
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

	public BigDecimal getconversionMultiple() {
		return conversionMultiple;
	}

	public void setconversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

}
