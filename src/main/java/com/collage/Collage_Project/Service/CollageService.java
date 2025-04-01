package com.collage.Collage_Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.collage.Collage_Project.Dao.CollageDao;
import com.collage.Collage_Project.Entity.Collage;
import com.collage.Collage_Project.Entity.ResponseStructure;

import jakarta.servlet.http.HttpSession;

@Service
public class CollageService {

	@Autowired
	private CollageDao collageDao;
	
	@Autowired
	private ResponseStructure<Collage> responseStructure;
	
	/*
	 * insert the method..
	 */
	public ResponseStructure<Collage> saveCollage(Collage collage)
	{
		Collage c=collageDao.saveCollage(collage);
		if(c!=null)
		{
			responseStructure.setStatusCode(HttpStatus.ACCEPTED.value());
			responseStructure.setMessage("Collage is Register");
			responseStructure.setData(c);
		}
		return responseStructure;
	}
		/*
		 * GetById...
		 */
		public ResponseStructure<Collage> getById(int id)
		{
			Collage c=collageDao.getById(id);
			if(c!=null)
			{
				responseStructure.setStatusCode(HttpStatus.FOUND.value());
				responseStructure.setMessage("Data is present");
				responseStructure.setData(c);
				
			}
			return responseStructure;
		}
		
		/*
		 * getById NativeQuery
		 */
		public Collage getByIdNative(int id)
		{
			return collageDao.getById(id);
		}
}
