package com.mongoOne;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel,String>
{
  // we can use customer operations or CRUD operations provide MongoRespository
}
