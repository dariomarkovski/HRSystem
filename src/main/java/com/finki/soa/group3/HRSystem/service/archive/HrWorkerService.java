package com.finki.soa.group3.HRSystem.service.archive;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import com.finki.soa.group3.HRSystem.model.archive.exceptions.HrWorkerNotFoundException;

public interface HrWorkerService {

    HrWorker save(HrWorker person);
    HrWorker getById(Long id) throws HrWorkerNotFoundException;
    void delete(Long id);
    Iterable<HrWorker> getAllHrWorkers();


}
