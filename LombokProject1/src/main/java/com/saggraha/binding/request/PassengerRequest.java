package com.saggraha.binding.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerRequest {
	private String passengerName;
	private String onboardPlace;
	private String destinationPlace;
	private String berthType;
	private String ticketStatus;
	private Double ticketPrice;
	
	public static void getData() {
		
	}
}
