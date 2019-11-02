package demo.genevention.project.genevention.service;

import demo.genevention.project.genevention.SpineMorphology;
import org.bson.types.ObjectId;

import java.util.List;

public interface SpineService {
    List<SpineMorphology> findAll();
    void save(SpineMorphology spineMorphology);
    void delete(ObjectId employeeId);
    void update(ObjectId id, SpineMorphology spineMorphology);
    List<SpineMorphology> threeFields(String x, String y, String z);
}
