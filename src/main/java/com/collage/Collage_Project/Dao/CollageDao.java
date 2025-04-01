package com.collage.Collage_Project.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collage.Collage_Project.Entity.Collage;
import com.collage.Collage_Project.Repository.CollageRepository;

@Repository
public class CollageDao {

	@Autowired
	private CollageRepository collageRepository;
	/*
	 * Insert the method..
	 */
	public Collage saveCollage(Collage collage)
	{
		return collageRepository.save(collage);
	}
	
	/*
	 * getbyId for Collage..
	 */
	public Collage getById(int id)
	{
		Optional<Collage> optional=collageRepository.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
	
	/*
	 * getById NativeQuery..
	 */
	public Collage getByIdNative(int id)
	{
		return collageRepository.getById(id);
	}
}
