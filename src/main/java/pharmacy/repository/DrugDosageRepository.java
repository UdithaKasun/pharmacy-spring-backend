package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugDosage;


public interface DrugDosageRepository extends MongoRepository<DrugDosage, String>{
	
}
