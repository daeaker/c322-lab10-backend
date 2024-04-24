package edu.iu.habahram.ducksservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;
@Entity
@Table(schema = "ducks", name = "ducks")
public class DuckData {
    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  String type;

    public DuckData() {
    }

    public DuckData(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static DuckData fromLine(String line) {
        String[] words = line.split(",");
        DuckData duckData = new DuckData(Integer.valueOf(words[0]), words[1], words[2]);
        return duckData;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toLine() {
        String line = this.id + "," + this.name + "," + this.type;
        return line;
    }
}