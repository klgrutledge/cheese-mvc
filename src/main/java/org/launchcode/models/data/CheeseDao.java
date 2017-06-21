package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Krysta on 6/20/17.
 */
@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer>{ //can't use primitive types in context of generics
}
