package com.userService.feignClient;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.userService.model.Hotel;


//@FeignClient(name="HOTEL_SERVICE")
public interface HotelService {
	
	//@GetMapping("/hotel/{hotel_id}")
	//Hotel getHotel(@PathVariable("hotel_id") String hotel_id);
		
	

}
