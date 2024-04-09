package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.List;

public interface VideoManager {
    public Video addVideo(Video video);
    public boolean deleteVideo(Video video);
    public boolean deleteVideobyId(Integer id);
    public Video updateCreator(Video video);
    public List<Video> gettAllVideo();
    public Video getVideoById(Integer id);
}
