package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.service.VideoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class VideoController {
    @Autowired
    private VideoManager videoManager;
    @GetMapping("/index")
    public String acceuil(Model model) {
        List<Video> videos = videoManager.gettAllVideo();
        model.addAttribute("listVideos",videos);
        return "index";
    }

    @GetMapping("/detailsVideos")
    public String detailVideos(Model model, @RequestParam(name = "id")Integer id) {
        Video video = videoManager.getVideoById(id);
        model.addAttribute("videoWithDetails", video);
        return "detailsVideo";
    }
    @GetMapping("/ajouterVideo")
    private String ajouterVideo(Model model) {return "ajouterVideo"; }
    @PostMapping("ajouterVideo")
    public String modifierVideo(Model model, @RequestParam(name = "url")String url, @RequestParam(name = "description")String description, @RequestParam(name = "datepublication")Date datePublication) {
        Video video = new Video();
        video.setUrl(video.getUrl());
        video.setDescription(video.getDescription());
        video.setDatePublication(video.getDatePublication());
        Creator creator = video.getCreator();
        video.setCreator(creator);
        videoManager.addVideo(video);
        return "redirect:getlistVideo";

    }

}
