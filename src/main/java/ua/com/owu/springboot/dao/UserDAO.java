package ua.com.owu.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ua.com.owu.springboot.models.User;

//@Component
//@Repository
public interface UserDAO
        extends JpaRepository<User, Integer> { //Integer - the type of identifier

    // Ad that is all for the whole dao cluster
}
