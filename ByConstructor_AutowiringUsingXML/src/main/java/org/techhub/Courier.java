package org.techhub;

public class Courier {
	private String CompanyName;
	private String Website;
	private Parcel parcel;
	
	public Courier(Parcel parcel)
	{
		this.parcel=parcel;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String website) {
		Website = website;
	}

	public Parcel getParcel() {
		return parcel;
	}

	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}
}
