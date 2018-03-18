package com.finki.soa.group3.HRSystem.service.training.Implementation;

import com.finki.soa.group3.HRSystem.model.training.Chapter;
import com.finki.soa.group3.HRSystem.service.training.ChapterService;

public class ChapterServiceImpl implements ChapterService {

    private final ChapterService chapterService;

    public ChapterServiceImpl(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @Override
    public Chapter createChapter(Chapter chapter) {
        return chapterService.createChapter(chapter);
    }

    @Override
    public Chapter updateChapter(Chapter chapter) {
        return chapterService.updateChapter(chapter);
    }

    @Override
    public long deleteChapter(long chapterId) {
        return chapterService.deleteChapter(chapterId);
    }
}
