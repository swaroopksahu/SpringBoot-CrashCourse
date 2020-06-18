package com.swaroop.learningspring.web;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swaroop.learningspring.business.domain.RoomReservation;
import com.swaroop.learningspring.business.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class RoomReservationWebServiceController {
	private ReservationService reservationService;

	public RoomReservationWebServiceController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public List<RoomReservation> getRoomReservation(@RequestParam(name="date", required=false) String dateString){
		Date date = DateUtils.createDateFromDateString(dateString);
		return this.reservationService.getRoomReservationsForDate(date);	
	}
	

}
