package org.packt.hotel.portal.model.data;
// Generated 09 19, 15 12:25:43 AM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * HmsRoomsMasterlist generated by hbm2java
 */
public class HmsRoomsMasterlist implements java.io.Serializable {

	private Integer id;
	private HmsRoomType hmsRoomType;
	private Status status;
	private String roomId;
	private String description;
	private Set<HmsRoomBooking> hmsRoomBookings = new HashSet<HmsRoomBooking>(0);

	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HmsRoomType getHmsRoomType() {
		return this.hmsRoomType;
	}

	public void setHmsRoomType(HmsRoomType hmsRoomType) {
		this.hmsRoomType = hmsRoomType;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<HmsRoomBooking> getHmsRoomBookings() {
		return this.hmsRoomBookings;
	}

	public void setHmsRoomBookings(Set<HmsRoomBooking> hmsRoomBookings) {
		this.hmsRoomBookings = hmsRoomBookings;
	}

}
