package Org.Techhub;

public class Parcel {
	private int id;
	private String name;
	private String sourceAddress;
	private String DestAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourceAddress() {
		return sourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}
	public String getDestAddress() {
		return DestAddress;
	}
	public void setDestAddress(String destAddress) {
		DestAddress = destAddress;
	}
}
