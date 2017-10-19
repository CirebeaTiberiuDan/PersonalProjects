package ro.sci.restaurant.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sci.restaurant.model.Customer;


@Repository
@Transactional
public interface ReservationRepository extends CrudRepository<Customer, Integer> {

//    Customer findByUid(int id);
//
//    List<Customer> findByName(String fullname); //todo ??
//
//    List<Customer> findAll();


    //TODO JPA DOESNT RECOGNIZE MAPPING FOR TYPE CUSTOMER > see method above
}
