package com.finki.soa.group3.HRSystem.persistence.training;

import com.finki.soa.group3.HRSystem.model.training.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository  extends CrudRepository<Chapter, Long>{
}
