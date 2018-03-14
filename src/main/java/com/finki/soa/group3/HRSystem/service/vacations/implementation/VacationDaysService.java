package com.finki.soa.group3.HRSystem.service.vacations.implementation;

import com.finki.soa.group3.HRSystem.model.Employee;
import com.finki.soa.group3.HRSystem.model.vacations.VacationDays;
import com.finki.soa.group3.HRSystem.persistence.vacations.VacationDaysRepository;
import com.finki.soa.group3.HRSystem.persistence.vacations.VacationRepository;
import com.finki.soa.group3.HRSystem.service.vacations.IVacationDaysService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class VacationDaysService implements IVacationDaysService {

    @PersistenceContext
    private EntityManager entityManager;

    private VacationDaysRepository vacationDaysRepository;
    private VacationRepository vacationRepository;

    public VacationDaysService(VacationDaysRepository vacationDaysRepository, VacationRepository vacationRepository) {
        this.vacationDaysRepository = vacationDaysRepository;
        this.vacationRepository = vacationRepository;
    }

    @Override
    public Integer getVacationDaysForEmployee(Long id, String startDate, String endDate, Boolean exclusive) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startDateTime = LocalDateTime.parse(startDate, formatter);
        LocalDateTime endDateTime = LocalDateTime.parse(endDate, formatter);

        int vacationDays = 0;

        if (exclusive) {
            vacationDays = vacationDaysRepository.sumVacationDaysForEmployeeExclusive(id, startDateTime, endDateTime)
                    - vacationRepository.sumVacationDurationForEmployeeExclusive(id, startDateTime, endDateTime);
        } else {
            vacationDays = vacationDaysRepository.sumVacationDaysForEmployee(id, startDateTime, endDateTime)
                    - vacationRepository.sumVacationDurationForEmployee(id, startDateTime, endDateTime);
        }

        return vacationDays;
    }

	@Override
	public VacationDays save(Long id, VacationDays vacationDays) {

        Employee employee = entityManager.getReference(Employee.class, id);

        vacationDays.setEmployee(employee);
        
        return vacationDaysRepository.save(vacationDays);
	}

	@Override
	public void delete(Long vacationDaysId) {
        vacationDaysRepository.deleteById(vacationDaysId);
	}

}