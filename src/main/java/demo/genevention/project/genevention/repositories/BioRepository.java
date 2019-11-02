package demo.genevention.project.genevention.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import demo.genevention.project.genevention.SpineMorphology;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BioRepository extends MongoRepository<SpineMorphology, String> {

    SpineMorphology findBy_id(ObjectId _id);

}