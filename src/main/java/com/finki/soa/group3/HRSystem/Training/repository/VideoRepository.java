package com.finki.soa.group3.HRSystem.Training.repository;

import com.finki.soa.group3.HRSystem.Training.Model.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {

}
