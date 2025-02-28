package org.techhub;

public class Courier {
	private Parcel parcel;

	public Parcel getParcel() {
		return parcel;
	}

	public void setParcel(Parcel parcel) {
		this.parcel = parcel;
	}
	public void show()
	{
		System.out.println("Id\tName\t\tSource\tDestination");
		System.out.println("==========================================");
		System.out.println(parcel.getId()+"\t"+parcel.getName()+"\t"+parcel.getSourceAddress()+"\t"+parcel.getDestAddress());
	}
}
