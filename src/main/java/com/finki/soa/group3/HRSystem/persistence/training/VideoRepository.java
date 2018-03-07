package com.finki.soa.group3.HRSystem.persistence.training;

import com.finki.soa.group3.HRSystem.model.training.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

}
