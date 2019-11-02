package demo.genevention.project.genevention;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bio")
public class SpineMorphology {

    //The @Id annotation tells spring that the _id field will be used as the primary identifier.
    @Id
    private ObjectId _id;

    private String num_mitochondria;
    private String membrane_area;
    private String spine_volume;
    private String mitochondria_volume;
    private String spine_volume_slice;
    private String num_vesicles;
    private String active_zone_area;
    private String vacuole_vol;

    public String getMitochondria_volume() {
        return mitochondria_volume;
    }

    public void setMitochondria_volume(String mitochondria_volume) {
        this.mitochondria_volume = mitochondria_volume;
    }

    public String getSpine_volume_slice() {
        return spine_volume_slice;
    }

    public void setSpine_volume_slice(String spine_volume_slice) {
        this.spine_volume_slice = spine_volume_slice;
    }

    public String getNum_vesicles() {
        return num_vesicles;
    }

    public void setNum_vesicles(String num_vesicles) {
        this.num_vesicles = num_vesicles;
    }

    public String getActive_zone_area() {
        return active_zone_area;
    }

    public void setActive_zone_area(String active_zone_area) {
        this.active_zone_area = active_zone_area;
    }

    public String getVacuole_vol() {
        return vacuole_vol;
    }

    public void setVacuole_vol(String vacuole_vol) {
        this.vacuole_vol = vacuole_vol;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getNum_mitochondria() {
        return num_mitochondria;
    }

    public void setNum_mitochondria(String num_mitochondria) {
        this.num_mitochondria = num_mitochondria;
    }

    public String getMembrane_area() {
        return membrane_area;
    }

    public void setMembrane_area(String membrane_area) {
        this.membrane_area = membrane_area;
    }

    public String getSpine_volume() {
        return spine_volume;
    }

    public void setSpine_volume(String spine_volume) {
        this.spine_volume = spine_volume;
    }
}
