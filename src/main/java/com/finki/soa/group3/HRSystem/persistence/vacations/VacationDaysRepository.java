package com.finki.soa.group3.HRSystem.persistence.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.VacationDays;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VacationDaysRepository extends CrudRepository<VacationDays, Long> {

    @Query("SELECT SUM(amount) FROM VacationDays WHERE employee.id = :id AND "
            + "validFrom < :startDate AND validTo > :endDate")
    int sumVacationDaysForEmployeeExclusive(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT SUM(amount) FROM VacationDays WHERE employee.id = :id AND "
            + "((:startDate > validFrom AND :startDate < validTo) OR (:endDate > validFrom AND :endDate < validTo))")
    int sumVacationDaysForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM VacationDays WHERE employee.id = :id AND " + "validFrom < :startDate AND validTo > :endDate")
    Iterable<VacationDays> findVacationDaysForEmployeeExclusive(Long id, LocalDateTime startDate,
            LocalDateTime endDate);

    @Query("SELECT * FROM VacationDays WHERE employee.id = :id AND "
            + "((:startDate > validFrom AND :startDate < validTo) OR (:endDate > validFrom AND :endDate < validTo))")
    Iterable<VacationDays> findVacationDaysForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

}
