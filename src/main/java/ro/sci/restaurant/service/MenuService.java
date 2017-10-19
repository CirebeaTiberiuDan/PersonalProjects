package ro.sci.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.restaurant.model.Menu;
import ro.sci.restaurant.repository.MenuRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cosmin on 9/25/17.
 */
@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public Menu findByUid(int id) {
        return menuRepository.findByUid(id);
    }

    public List<Menu> getAll() {
        List<Menu> menu = new ArrayList<>();
        menuRepository.findAll()
                .forEach(menu::add);
        return menu;
    }

    public void update(Menu menu) {
        menuRepository.save(menu);
    }

    public void add(Menu menuItem) {
        boolean menuExists = false;
        for (Menu menu : menuRepository.findAll()) {
            if (menu.getDishName().equals(menuItem.getDishName())) {
                menuExists = true;
                break;
            }
        }
        if (menuExists == false) {
            menuRepository.save(menuItem);
        }
    }

    public void remove(Menu menuItem) {
        for (Menu menu : menuRepository.findAll()) {
            if (menu.getDishName().equals(menuItem.getDishName())) {
                menuRepository.delete(menu.getUid());
            }
        }
    }
}
