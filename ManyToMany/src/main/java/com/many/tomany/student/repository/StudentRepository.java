package com.many.tomany.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.many.tomany.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	@Query(value = "select * from student_course,course ,student", nativeQuery = true)
	public List<Object> listing();
	
	
	@Query(value = "select \n"
			+ "foriegn.student_id,\n"
			+ "foriegn.course_id,\n"
			+ "courses1.id,\n"
			+ "courses1.name\n"
			+ "from student_course foriegn\n"
			+ "	inner join\n"
			+ "		course courses1\n"
			+ "		on foriegn.course_id = courses1.id\n"
			+ "		where\n"
			+ "		foriegn.student_id=1",nativeQuery = true)
	public List<Object> listAllTheValueUsingQuery();
}
