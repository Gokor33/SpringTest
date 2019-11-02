package demo.genevention.project.genevention.controller;

import demo.genevention.project.genevention.SpineMorphology;

public class SpineFactory {

    private final SpineMorphology spineMorphology;

    public SpineFactory(SpineMorphology spineMorphology){
        this.spineMorphology = spineMorphology;
    }

    public String getBio(String bioType) {
        if(bioType == null){
            return null;
        }

        else if(bioType.equalsIgnoreCase("ID")){
            return spineMorphology.get_id();
        }

        else if(bioType.equalsIgnoreCase("ACTIVE ZONE AREA")){
            return spineMorphology.getActive_zone_area();
        }

        else if(bioType.equalsIgnoreCase("MEMBRANE AREA")){
            return spineMorphology.getMembrane_area();
        }

        else if(bioType.equalsIgnoreCase("MITOCHONDRIA VOLUME")){
            return spineMorphology.getMitochondria_volume();
        }

        else if(bioType.equalsIgnoreCase("NUM MITOCHONDRIA")){
            return spineMorphology.getNum_mitochondria();
        }

        else if(bioType.equalsIgnoreCase("NUM VESICLES")){
            return spineMorphology.getNum_vesicles();
        }

        else if(bioType.equalsIgnoreCase("SPINE VOLUME")){
            return spineMorphology.getSpine_volume();
        }

        else if(bioType.equalsIgnoreCase("SPINE VOLUME SLICE")){
            return spineMorphology.getSpine_volume_slice();
        }

        else if(bioType.equalsIgnoreCase("VACUOLE VOLUME")){
            return spineMorphology.getVacuole_vol();
        }

        return bioType;
    }

}
