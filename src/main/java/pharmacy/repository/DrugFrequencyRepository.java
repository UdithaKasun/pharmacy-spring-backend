package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugFrequency;


public interface DrugFrequencyRepository extends MongoRepository<DrugFrequency, String>{
	
}
