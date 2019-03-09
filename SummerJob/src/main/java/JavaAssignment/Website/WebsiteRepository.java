package JavaAssignment.Website;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteRepository extends MongoRepository<Website, String> {
    Website findByName(String name) ;




}
