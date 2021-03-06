package com.finki.soa.group3.HRSystem.WEB.vacations;

import com.finki.soa.group3.HRSystem.model.vacations.Vacation;
import com.finki.soa.group3.HRSystem.model.vacations.VacationReport;
import com.finki.soa.group3.HRSystem.service.vacations.IVacationService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "vacations")
public class VacationController {

    private IVacationService vacationService;

    public VacationController(IVacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping(value = "/{id}")
    public Iterable<Vacation> getVacationsForEmployee(@PathVariable Long id,
            @RequestParam(required = false) String startDate, @RequestParam(required = false) String endDate,
            @RequestParam(required = false, defaultValue = "false") Boolean exclusive) {
        return vacationService.getVacationsForEmployee(id, startDate, endDate, exclusive);
    }

    @PostMapping(value = "/{id}")
    public Vacation save(@PathVariable(value = "id") Long employeeId, @RequestBody Vacation vacation) {
        return vacationService.save(employeeId, vacation);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") Long vacationId) {
        vacationService.delete(vacationId);
    }

    @GetMapping(value = "/report/{id}")
    public VacationReport getReportForEmployee(@PathVariable Long id, @RequestParam String startDate,
            @RequestParam String endDate, @RequestParam(required = false, defaultValue = "false") Boolean exclusive) {
        return vacationService.getReportForEmployee(id, startDate, endDate, exclusive);
    }
}