package itc.hoseo.pos.repository.impl;

import itc.hoseo.pos.domain.Item;
import itc.hoseo.pos.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

public class HashMapItemRepository implements ItemRepository {
    @Override
    public Optional<Item> additem(Item item) {
        return Optional.empty();
    }

    @Override
    public void delItem(Integer id) {

    }

    @Override
    public List<Item> findByItem(String name) {
        return null;
    }

}
