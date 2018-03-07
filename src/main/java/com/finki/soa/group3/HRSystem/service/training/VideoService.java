package com.finki.soa.group3.HRSystem.service.training;

import com.finki.soa.group3.HRSystem.model.training.Video;
import org.springframework.stereotype.Service;

@Service
public interface VideoService {
    public Video createVideo(Video video);
    public Video updateVideo(Video video);
    public long deleteVideo(long videoId);
}
