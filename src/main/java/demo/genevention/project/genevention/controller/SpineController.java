package demo.genevention.project.genevention.controller;

import demo.genevention.project.genevention.SpineMorphology;
import demo.genevention.project.genevention.service.SpineServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

@RestController
public class SpineController {

    @Autowired
    private SpineServiceImpl spineServiceImpl;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<SpineMorphology> getAllBioInfo(){
        return spineServiceImpl.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public SpineMorphology newBioInfo(@Valid @RequestBody SpineMorphology spineMorphology) {
        spineMorphology.set_id(ObjectId.get());
        spineServiceImpl.save(spineMorphology);
        return spineMorphology;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public void updateBioInfo(@PathVariable("id") ObjectId id, @Valid @RequestBody SpineMorphology spineMorphology){
        spineMorphology.set_id(id);
        spineServiceImpl.update(id, spineMorphology);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBioInfo(@PathVariable ObjectId id){
        spineServiceImpl.delete(id);
    }

    @RequestMapping(value = "/top10/{x}/{y}/{z}", method = RequestMethod.GET)
    public List<SpineMorphology> getTopTen(@PathVariable("x") String x,
                                           @PathVariable("y") String y,
                                           @PathVariable("z") String z){
        List<SpineMorphology> spine;
        spine = spineServiceImpl.threeFields(x, y, z);
        return spine.stream().limit(4).collect(Collectors.toList());
    }


//    public List<Results> getElements(String... strings){
//        List<String> list = new ArrayList<>(Arrays.asList(strings));
//        List<SpineMorphology> io = spineServiceImpl.findAll();
//        for(int i = 0; i < io.size(); i++){
//            for(int j = 0; j < list.size(); j++){
//                SpineMorphology t = io.get(i);
//                SpineFactory spineFactory = new SpineFactory(t);
//                spineFactory.getBio(list.get(j));
//                }
//            }
//    }
//    }
}
