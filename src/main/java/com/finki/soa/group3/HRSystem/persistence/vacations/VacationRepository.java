package com.finki.soa.group3.HRSystem.persistence.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.Vacation;

import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRepository extends CrudRepository<Vacation, Long> {

    @Query("SELECT SUM(v.duration) FROM Vacation v WHERE employee.id = :id AND "
            + "startDate < :startDate AND endDate > :endDate")
    int sumVacationDurationForEmployeeExclusive(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT SUM(v.duration) FROM Vacation v WHERE employee.id = :id AND "
            + "((:startDate > startDate AND :startDate < endDate) OR (:endDate > startDate AND :endDate < endDate))")
    int sumVacationDurationForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT v FROM Vacation v WHERE employee.id = :id")
    Iterable<Vacation> findVacationsForEmployee(Long id);

    @Query("SELECT v FROM Vacation v WHERE employee.id = :id AND startDate < :date AND :date < endDate")
    Iterable<Vacation> findVacationsForEmployee(Long id, LocalDateTime date);

    @Query("SELECT v FROM Vacation v WHERE employee.id = :id AND " + "startDate < :startDate AND endDate > :endDate")
    Iterable<Vacation> findVacationsForEmployeeExclusive(Long id, LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT v FROM Vacation v WHERE employee.id = :id AND "
            + "((:startDate > startDate AND :startDate < endDate) OR (:endDate > startDate AND :endDate < endDate))")
    Iterable<Vacation> findVacationsForEmployee(Long id, LocalDateTime startDate, LocalDateTime endDate);

}
