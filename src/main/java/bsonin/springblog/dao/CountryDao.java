package bsonin.springblog.dao;

import bsonin.springblog.model.Country;

import java.util.List;

public interface CountryDao {

    public List<Country> getAllCountries();

    public Country getCountryByName(String name);
}
