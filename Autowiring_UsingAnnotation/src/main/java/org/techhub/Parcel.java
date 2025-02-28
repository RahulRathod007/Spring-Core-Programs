package org.techhub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("parcel")
public class Parcel {
	@Value("1")
	private int id;
	@Value("SmartPhone")
	private String name;
	@Value("Pune")
	private String SourceAddress;
	@Value("Mumbai")
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
		return SourceAddress;
	}
	public void setSourceAddress(String sourceAddress) {
		SourceAddress = sourceAddress;
	}
	public String getDestAddress() {
		return DestAddress;
	}
	public void setDestAddress(String destAddress) {
		DestAddress = destAddress;
	}
}
