package com.collage.Collage_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collage.Collage_Project.Entity.Collage;

public interface CollageRepository extends JpaRepository<Collage, Integer>{

	public Collage getById(int id);
}
