package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.Drug;

public interface DrugRepository extends MongoRepository<Drug, String>{
	
}
