package com.finki.soa.group3.HRSystem.Training.service;

import com.finki.soa.group3.HRSystem.Training.Model.Video;
import org.springframework.stereotype.Service;

@Service
public interface VideoService {
    public Video createVideo(Video video);
    public Video updateVideo(Video video);
    public long deleteVideo(long videoId);
}
