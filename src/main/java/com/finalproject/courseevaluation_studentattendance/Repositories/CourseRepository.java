package com.finalproject.courseevaluation_studentattendance.Repositories;

import com.finalproject.courseevaluation_studentattendance.Model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
   Iterable<Course> findAllByCourseName(String courseName);
    Course findByCrn(String crn);


}
