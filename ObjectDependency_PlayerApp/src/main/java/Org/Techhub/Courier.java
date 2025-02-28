package Org.Techhub;

public class Courier {
	private String CompanyName;
	private String Website;
	private Parcel parcel;
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
	public void Display()
	{
		System.out.println("\nCompany Name is: "+CompanyName);
		System.out.println("Website is : "+Website);
	}
	public void show()
	{
		System.out.println("Id\tName\tSouceAddress\tDestAddress");
		System.out.println("==============================================");
		System.out.println(parcel.getId()+"\t"+parcel.getName()+"\t"+parcel.getSourceAddress()+"\t"+parcel.getDestAddress());
	}
}
