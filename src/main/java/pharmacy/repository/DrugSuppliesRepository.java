package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import pharmacy.model.DrugSupply;

public interface DrugSuppliesRepository extends MongoRepository<DrugSupply, String>,QueryByExampleExecutor<DrugSupply>{

}
