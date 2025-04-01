package com.collage.Collage_Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collage.Collage_Project.Entity.Collage;
import com.collage.Collage_Project.Entity.ResponseStructure;
import com.collage.Collage_Project.Service.CollageService;

@RestController
@RequestMapping( value = "/collage")
public class CollageController {

	@Autowired
	private CollageService collageService;
	
	/*
	 * Insert the method..
	 */
	@PostMapping("/saveCollage")
	public ResponseStructure<Collage> saveCollage(@RequestBody Collage collage)
	{
		return collageService.saveCollage(collage);
	}
	
	/*
	 * getById..
	 */
	@GetMapping("getById/{id}")
	public ResponseStructure<Collage> getById(@PathVariable int id)
	{
		ResponseStructure<Collage> collage=collageService.getById(id);
		return collage;
	}
	
	/*
	 * GetById NativeQuery..
	 */
	@GetMapping("/getByIdNative/{id}")
	public Collage getByIdNative(@PathVariable int id)
	{
		return collageService.getByIdNative(id);
	}
}
