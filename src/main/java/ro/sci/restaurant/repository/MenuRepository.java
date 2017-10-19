package ro.sci.restaurant.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sci.restaurant.model.Menu;

//import ro.sci.restaurant.domain.Item;


@Repository
@Transactional
public interface MenuRepository extends CrudRepository<Menu, Integer> {

    //Menu findByName(String name);
    Menu findByUid(int id);

    Menu findAllByDishName(String dishName);
    //Menu findAllByIngredients(Item item); //TODO IT WORKS ?

    //TODO
}
