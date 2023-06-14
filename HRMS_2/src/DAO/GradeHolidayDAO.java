package DAO;

import java.util.List;

import models.GradeHoliday;

public interface GradeHolidayDAO {
	List<GradeHoliday> findAllGradeHolidays();

	GradeHoliday findHolidayById(String id);


}
