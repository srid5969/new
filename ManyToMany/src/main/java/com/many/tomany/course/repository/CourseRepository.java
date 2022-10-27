package com.many.tomany.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.tomany.course.model.Course;
@Repository
public interface  CourseRepository extends JpaRepository<Course, Long> {
}
