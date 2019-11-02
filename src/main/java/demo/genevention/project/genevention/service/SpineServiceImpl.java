package demo.genevention.project.genevention.service;

import demo.genevention.project.genevention.SpineMorphology;
import demo.genevention.project.genevention.repositories.BioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpineServiceImpl implements SpineService {

    @Autowired
    private BioRepository bioRepository;

    private MongoTemplate mongoTemplate;

    public SpineServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<SpineMorphology> findAll() {
        return bioRepository.findAll();
    }

    @Override
    public void save(SpineMorphology spineMorphology) {
        bioRepository.save(spineMorphology);
    }

    @Override
    public void delete(ObjectId id) {
        bioRepository.delete(bioRepository.findBy_id(id));
    }

    @Override
    public void update(ObjectId id, SpineMorphology spineMorphology) {
        bioRepository.save(spineMorphology);
    }

    @Override
    public List<SpineMorphology> threeFields(String x, String y, String z) {
        Query query = new Query();

        query.with(Sort.by(z));
//        query.fields().include("_id");
        query.fields().include(x);
        query.fields().include(y);
        query.fields().include(z);
        return mongoTemplate.find(query, SpineMorphology.class);
    }

//    @Override
//    public List<SpineMorphology> threeFields(String x, String y, String z) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("x"))
//        return null;
//    }
}
