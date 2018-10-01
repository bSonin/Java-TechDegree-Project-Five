package bsonin.springblog.model;

import java.util.Set;

public class Country {
    private String name;
    private Long population;
    private String city;
    private Set<String> languages;

    public Country(String name, Long population, String city, Set<String> languages) {
        this.name = name;
        this.population = population;
        this.city = city;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }
}
