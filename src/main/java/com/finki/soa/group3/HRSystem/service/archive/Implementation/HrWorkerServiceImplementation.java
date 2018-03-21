package com.finki.soa.group3.HRSystem.service.archive.Implementation;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import com.finki.soa.group3.HRSystem.persistence.person.HrWorkerRepository;
import com.finki.soa.group3.HRSystem.service.archive.person.HrWorkerService;
import org.springframework.stereotype.Service;

@Service
public class HrWorkerServiceImplementation implements HrWorkerService{
    private final HrWorkerRepository hrWorkerRepository;

    public HrWorkerServiceImplementation(HrWorkerRepository hrWorkerRepository) {
        this.hrWorkerRepository = hrWorkerRepository;
    }

    @Override
    public HrWorker save(HrWorker hrWorker) {
        return this.hrWorkerRepository.save(hrWorker);
    }

    @Override
    public void delete(Long id) {
        this.hrWorkerRepository.deleteById(id);
    }

    @Override
    public Iterable<HrWorker> getAllHrWorkers() {
        return this.hrWorkerRepository.findAll();
    }
}
