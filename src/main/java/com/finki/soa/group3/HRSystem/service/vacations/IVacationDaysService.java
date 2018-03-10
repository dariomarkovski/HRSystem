package com.finki.soa.group3.HRSystem.service.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.VacationDays;

public interface IVacationDaysService {

	void delete(Long vacationDaysId);

	VacationDays save(Long id, VacationDays vacationDays);

	Integer getVacationDaysForEmployee(Long id, String startDate, String endDate, Boolean exclusive);

}