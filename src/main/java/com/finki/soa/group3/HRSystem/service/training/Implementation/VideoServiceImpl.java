package com.finki.soa.group3.HRSystem.service.training.Implementation;

import com.finki.soa.group3.HRSystem.model.training.Video;
import com.finki.soa.group3.HRSystem.service.training.VideoService;

public class VideoServiceImpl implements VideoService {
    private final VideoService videoService;

    public VideoServiceImpl(VideoService videoService) {
        this.videoService = videoService;
    }

    @Override
    public Video createVideo(Video video) {
        return videoService.createVideo(video);
    }

    @Override
    public Video updateVideo(Video video) {
        return videoService.updateVideo(video);
    }

    @Override
    public long deleteVideo(long videoId) {
        return videoService.deleteVideo(videoId);
    }
}
