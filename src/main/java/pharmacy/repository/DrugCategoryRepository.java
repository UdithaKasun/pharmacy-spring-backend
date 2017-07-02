package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugCategory;


public interface DrugCategoryRepository extends MongoRepository<DrugCategory, String>{

}
