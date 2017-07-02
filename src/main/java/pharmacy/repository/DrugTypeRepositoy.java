package pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pharmacy.model.DrugType;

public interface DrugTypeRepositoy  extends MongoRepository<DrugType, String>{

}
