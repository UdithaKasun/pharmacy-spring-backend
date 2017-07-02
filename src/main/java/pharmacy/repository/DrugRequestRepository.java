package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugRequest;

public interface DrugRequestRepository extends MongoRepository<DrugRequest, String>{

}
