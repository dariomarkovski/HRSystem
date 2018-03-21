package com.finki.soa.group3.HRSystem.WEB.archive;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.HrWorkerNotFoundException;
import com.finki.soa.group3.HRSystem.service.archive.HrWorkerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hrworker")
public class HrWorkerController {

    private final HrWorkerService hrWorkerService;

    public HrWorkerController(HrWorkerService hrWorkerService) {
        this.hrWorkerService = hrWorkerService;
    }

    @PostMapping
    HrWorker save(@ModelAttribute HrWorker person) {
        return this.hrWorkerService.save(person);
    }

    @GetMapping(value = "/{id}")
    HrWorker getById(@PathVariable("id") Long id) throws HrWorkerNotFoundException {
        return this.hrWorkerService.getById(id);
    }

    @DeleteMapping(value = "/{id}")
    void delete(@PathVariable("id") Long id){
        this.hrWorkerService.delete(id);
    }

    @GetMapping
    Iterable<HrWorker> getAllHrWorkers(){
        return this.hrWorkerService.getAllHrWorkers();
    }

}
