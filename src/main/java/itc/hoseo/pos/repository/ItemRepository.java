package itc.hoseo.pos.repository;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.domain.Member;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {
    public Optional<Item> additem(Item item);

    public void delItem(Integer id);

    public List<Item> findByItem(String name);

}
