package com.hcl.busbooking.controller;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.busbooking.dto.BookingDto;
import com.hcl.busbooking.dto.BookingsDto;
import com.hcl.busbooking.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	private BookingService bookingService;
	BookingDto booking1=new BookingDto();
	@PostMapping("/booking")
	public ResponseEntity<BookingDto> bookingtheTicket(@RequestBody BookingsDto bookingsDto,@RequestParam long userAccountNumber,@RequestParam long busOpeartorAccountNumber) throws JSONException {
		 booking1=bookingService.bookTheSeat(bookingsDto,userAccountNumber,busOpeartorAccountNumber);
		return new ResponseEntity<BookingDto>(booking1, HttpStatus.CREATED);
	}

}
