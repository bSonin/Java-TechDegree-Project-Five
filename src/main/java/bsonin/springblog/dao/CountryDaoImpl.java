package bsonin.springblog.dao;

import bsonin.springblog.model.Country;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

@Repository
public class CountryDaoImpl implements CountryDao {

    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("U.S.A.", 325000000L, "Washington D.C.", new HashSet<>(Arrays.asList("No Official Language"))),
            new Country("China", 1400000000L, "Beijing", new HashSet<>(Arrays.asList("Standard Chinese"))),
            new Country("Russia", 144000000L, "Moscow", new HashSet<>(Arrays.asList("Russian"))),
            new Country("India", 1324000000L, "New Delhi", new HashSet<>(Arrays.asList("Hindi", "English"))),
            new Country("Canada", 37000000L, "Ottawa", new HashSet<>(Arrays.asList("English", "French")))
    );

    public List<Country> getAllCountries()
    {
        return new ArrayList<Country>(ALL_COUNTRIES);
    }

    // FIXME:bhs - Could be more elegant here...investigate streams
    public Country getCountryByName(String name)
    {
        for (Country country : ALL_COUNTRIES)
        {
            if (country.getName().equalsIgnoreCase(name))
            {
                return country;
            }
        }
        return null;
    }
}
