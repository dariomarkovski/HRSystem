package com.finki.soa.group3.HRSystem.Training.repository;

import com.finki.soa.group3.HRSystem.Training.Model.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository  extends CrudRepository<Chapter, Long>{
}
