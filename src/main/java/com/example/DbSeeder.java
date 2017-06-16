package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{
	private HotelRepository hotelRepository;
	
	public DbSeeder(HotelRepository hotelRepository){
		this.hotelRepository=hotelRepository;
	}
	
	
	@Override
	public void run(String... strings) throws Exception{	
		
		Hotel marriot = new Hotel(
				"Marriot",
				130,
				new Address("paris", "France"),
				Arrays.asList(
						new Review("Jhon", 8, false),
						new Review("Mary",7,  true)
						)
			
				);
		
		Hotel Taj = new Hotel(
				"Taj",
				100,
				new Address("chennai", "India"),
				Arrays.asList(
						new Review("Bala", 5, false),
						new Review("Irul",6,  true)
						)
			
				);
		
		Hotel ITC = new Hotel(
				"ITC",
				90,
				new Address("Bangalore", "India"),
				Arrays.asList()
				);
		
		//drop all hotels
		this.hotelRepository.deleteAll();
		
		//add our hotel to the database
		List<Hotel> hotels = Arrays.asList(marriot,Taj,ITC);
		this.hotelRepository.save(hotels);
	
	}
	
	
}
