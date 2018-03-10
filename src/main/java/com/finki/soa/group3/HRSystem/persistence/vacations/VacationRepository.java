package com.finki.soa.group3.HRSystem.persistence.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.Vacation;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VacationRepository extends CrudRepository<Vacation, Long> {

    @Query("SELECT SUM(amount) FROM Vacation WHERE employee.id = :id AND "
            + "startDate < :startDate AND endDate > :endDate")
    int sumVacationDurationForEmployeeExclusive(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT SUM(amount) FROM Vacation WHERE employee.id = :id AND "
            + "((:startDate > startDate AND :startDate < endDate) OR (:endDate > startDate AND :endDate < endDate))")
    int sumVacationDurationForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM Vacation WHERE employee.id = :id")
    Iterable<Vacation> findVacationsForEmployee(Long id);

    @Query("SELECT * FROM Vacation WHERE employee.id = :id AND startDate < :date AND :date < endDate")
    Iterable<Vacation> findVacationsForEmployee(Long id, LocalDateTime date);

    @Query("SELECT * FROM Vacation WHERE employee.id = :id AND " + "startDate < :startDate AND endDate > :endDate")
    Iterable<Vacation> findVacationsForEmployeeExclusive(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM Vacation WHERE employee.id = :id AND "
            + "((:startDate > startDate AND :startDate < endDate) OR (:endDate > startDate AND :endDate < endDate))")
    Iterable<Vacation> findVacationsForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

}
