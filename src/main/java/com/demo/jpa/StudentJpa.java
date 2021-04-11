package com.demo.jpa;
import com.demo.entity.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpa extends JpaRepository<StudentEntity, Long> {
	
	@Query("Select s from StudentEntity s where name =:name")
	public StudentEntity findByName(String name);
	
	@Query("Select s from StudentEntity s where branch =:branch")
	public StudentEntity findByBranch(String branch);
	
	@Query("Select s from StudentEntity s where year =:year")
	public StudentEntity findByYear(String year);

}
