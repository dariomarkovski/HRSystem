package com.finki.soa.group3.HRSystem.WEB.archive;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import com.finki.soa.group3.HRSystem.service.archive.person.HrWorkerService;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/hrworker")
public class HrWorkerController {

    private final HrWorkerService hrWorkerService;

    public HrWorkerController(HrWorkerService hrWorkerService) {
        this.hrWorkerService = hrWorkerService;
    }

    @PostMapping(value = "/addNewHrWorker")
    HrWorker save(@ModelAttribute HrWorker person) {
        return this.hrWorkerService.save(person);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    void delete(@PathVariable("id") Long id){
        this.hrWorkerService.delete(id);
    }

    @GetMapping(value = "/getAllHrWorkers")
    Iterable<HrWorker> getAllHrWorkers(){
        return this.hrWorkerService.getAllHrWorkers();
    }

}
