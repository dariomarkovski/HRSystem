package com.finki.soa.group3.HRSystem.service.archive.person;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;

public interface HrWorkerService {

    HrWorker save(HrWorker person);
    void delete(Long id);
    Iterable<HrWorker> getAllHrWorkers();

}
