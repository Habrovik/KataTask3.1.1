package KataTask311.dao;



import KataTask311.models.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    void updateUser(User user);

    void deleteById(Long id);
}
