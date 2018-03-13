package com.finki.soa.group3.HRSystem.WEB.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.VacationDays;
import com.finki.soa.group3.HRSystem.service.vacations.IVacationDaysService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "vacation-days")
public class VacationDaysController {

    private IVacationDaysService vacationDaysService;

    public VacationDaysController(IVacationDaysService vacationDaysService) {
        this.vacationDaysService = vacationDaysService;
    }

    @GetMapping(value = "/{id}")
    public Integer getVacationDaysForEmployee(@PathVariable Long id, @RequestParam(required = true) String startDate,
            @RequestParam(required = true) String endDate,
            @RequestParam(required = false, defaultValue = "false") Boolean exclusive) {
        return vacationDaysService.getVacationDaysForEmployee(id, startDate, endDate, exclusive);
    }

    @PostMapping(value = "/{id}")
    public VacationDays save(@PathVariable(value = "id") Long employeeId, @RequestBody VacationDays vacationDays) {
        return vacationDaysService.save(employeeId, vacationDays);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long vacationDaysId) {
        vacationDaysService.delete(vacationDaysId);
    }
}