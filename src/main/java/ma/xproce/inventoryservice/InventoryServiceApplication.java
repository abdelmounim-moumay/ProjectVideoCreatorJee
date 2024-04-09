package ma.xproce.inventoryservice;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication  implements CommandLineRunner {
    @Autowired
    private VideoRepository videoRepository;
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Video video = new Video();
        video.setName("got");
        video.setDescription("action");
        video.setUrl("ff");
        video.setDatePublication(new Date());
        videoRepository.saveAll(List.of(video));


    }
}
