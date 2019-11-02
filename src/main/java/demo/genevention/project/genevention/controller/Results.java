package demo.genevention.project.genevention.controller;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Results {

    private String result;

    public Results(String... strings){
        this.result = String.join(" ", strings);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
