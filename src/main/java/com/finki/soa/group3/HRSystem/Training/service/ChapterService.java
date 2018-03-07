package com.finki.soa.group3.HRSystem.Training.service;

import com.finki.soa.group3.HRSystem.Training.Model.Chapter;
import org.springframework.stereotype.Service;

@Service
public interface ChapterService {
    public Chapter createChapter(Chapter chapter);
    public Chapter updateChapter(Chapter chapter);
    public long deleteChapter(long chapterId);
}
