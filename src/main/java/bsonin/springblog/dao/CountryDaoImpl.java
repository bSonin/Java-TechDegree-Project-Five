package bsonin.springblog.dao;

import bsonin.springblog.model.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CountryDaoImpl implements CountryDao {
    // TODO: Populate countries here
    private static final List<Country> ALL_COUNTRIES = Arrays.asList(
            new Country("U.S.A.", null, null, null),
            new Country("China", null, null, null),
            new Country("Russia", null, null, null),
            new Country("India", null, null, null),
            new Country("Canada", null, null, null)
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
