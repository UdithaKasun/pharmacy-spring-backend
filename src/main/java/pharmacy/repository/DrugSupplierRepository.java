package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugSupplier;

public interface DrugSupplierRepository extends MongoRepository<DrugSupplier, String>{

}
