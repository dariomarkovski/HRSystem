package com.finki.soa.group3.HRSystem.service.training;

import com.finki.soa.group3.HRSystem.model.training.Chapter;
import org.springframework.stereotype.Service;

@Service
public interface ChapterService {
    public Chapter createChapter(Chapter chapter);
    public Chapter updateChapter(Chapter chapter);
    public long deleteChapter(long chapterId);
}
