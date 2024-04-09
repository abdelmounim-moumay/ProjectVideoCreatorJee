package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.List;

public interface CreatorManager {
    public Creator addCreator(Creator creator);
    public boolean deleteCreator(Creator creator);
    public boolean deleteCreatorbyId(Integer id);
    public Creator updateCreator(Creator creator);
    public List<Creator> gettAllCreator();

    Creator getCreatorById(Long id);
}
