package com.finki.soa.group3.HRSystem.persistence.person;

import com.finki.soa.group3.HRSystem.model.archive.HrWorker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrWorkerRepository extends CrudRepository<HrWorker, Long>{
}
