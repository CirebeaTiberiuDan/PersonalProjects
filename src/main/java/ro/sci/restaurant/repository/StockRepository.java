package ro.sci.restaurant.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sci.restaurant.model.Ingredients;

import java.util.List;


@Repository
@Transactional
public interface StockRepository extends CrudRepository<Ingredients, Integer> {

    Ingredients findByUid(int id);

    List<Ingredients> findAllByItem(String item);
    //List <Ingredients> findAllByItem(Item item);
    //TODO

}
