package com.example.mystore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Products")
public class Products {

	@Column(name = "HJMPTS")
	private Long HJMPTS;

	@Column(name = "CREATEDTS")
	@NotNull
	private String CREATEDTS;

	@Column(name = "MODIFIEDTS")
	@NotNull
	private String MODIFIEDTS;

	@Column(name = "TYPEPKSTRING")
	private Long TYPEPKSTRING;

	@Column(name = "OWNERPKSTRING")
	private Long OWNERPKSTRING;

	@Id
	@GeneratedValue
	@Column(name = "PK")
	@NotNull
	private Long id;

	@Column(name = "P_CODE")
	private String code;

	@Column(name = "P_UNIT")
	private Long unit;

	@Column(name = "P_THUMBNAIL")
	private Long thumbnail;

	@Column(name = "P_PICTURE")
	private Long picture;

	@Column(name = "P_CATALOG")
	private Long catalog;

	@Column(name = "P_CATALOGVERSION")
	private Long catalogVersion;

	@Column(name = "P_ONLINEDATE")
	@NotNull
	private String onlineDate;

	@Column(name = "P_OFFLINEDATE")
	@NotNull
	private String offlineDate;

	@Column(name = "P_EAN")
	private String EAN;

	@Column(name = "P_SUPPLIERALTERNATIVEAID")
	private String supplierAlternativeaid;

	@Column(name = "P_BUYERIDS")
	private byte[] buyerids;
	
	@Column(name = "P_MANUFACTURERAID")
	private String manufactureRaid;

	@Column(name = "P_MANUFACTURERNAME")
	private String manufacturerName;
	
	@Column(name = "P_ERPGROUPBUYER")
	private String erpGroupBuyer;
	
	@Column(name = "P_ERPGROUPSUPPLIER")
	private String erpGroupSupplier;
	
	@Column(name = "P_DELIVERYTIME")
	private Double deliveryTime;
	
	@Column(name = "P_SPECIALTREATMENTCLASSES")
	private byte[] specialTreatmentClasses;
	
	@Column(name = "P_ORDER")
	private int order;
	
	@Column(name = "P_APPROVALSTATUS")
	private Long approvalStatus;
	
	@Column(name = "P_CONTENTUNIT")
	private Long contentUnit;
	
	@Column(name = "P_NUMBERCONTENTUNITS")
	private Double numberContentUnits;
	
	@Column(name = "P_MINORDERQUANTITY")
	private int minOrderQuantity;
	
	@Column(name = "P_MAXORDERQUANTITY")
	private int maxOrderQuantity;
	
	@Column(name = "P_ORDERQUANTITYINTERVAL")
	private int orderQuantityInterval;
	
	@Column(name = "P_PRICEQUANTITY")
	private Double priceQuantity;
	
	@Column(name = "P_NORMAL")
	private String normal;
	
	@Column(name = "P_THUMBNAILS")
	private String thumbnails;
	
	@Column(name = "P_DETAIL")
	private String detail;
	
	@Column(name = "P_LOGO")
	private String logo;
	
	@Column(name = "P_DATA_SHEET")
	private String dataSheet;
	
	@Column(name = "P_OTHERS")
	private String others;
	
	@Column(name = "P_STARTLINENUMBER")
	private int startLineNumber;
	
	@Column(name = "P_ENDLINENUMBER")
	private int endLineNumber;
	
	@Column(name = "P_VARIANTTYPE")
	private Long variantType;
	
	@Column(name = "P_EUROPE1PRICEFACTORY_PPG")
	private Long europe1PriceFactoryPPG;
	
	@Column(name = "P_EUROPE1PRICEFACTORY_PTG")
	private Long europe1PriceFactoryPTG;
	
	@Column(name = "P_EUROPE1PRICEFACTORY_PDG")
	private Long europe1PriceFactoryPDG;
	
	@Column(name = "P_BAND")
	private Long band;
	
	@Column(name = "ACLTS")
	private Long aclts;
	
	@Column(name = "PROPTS")
	private Long propts;
	
	@Column(name = "P_BASEPRODUCT")
	private Long baseProduct;
	
	@Column(name = "P_VENUE")
	private String venue;
	
	@Column(name = "P_DATE")
	@NotNull
	private String date;
	
	@Column(name = "P_CONCERTTYPE")
	private Long concerttype;
	
}
