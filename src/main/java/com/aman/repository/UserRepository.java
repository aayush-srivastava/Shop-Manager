package com.aman.repository;

import com.aman.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Aayush Srivastava in April 2019.
 */
public interface UserRepository extends CrudRepository<User, Long>{

}
