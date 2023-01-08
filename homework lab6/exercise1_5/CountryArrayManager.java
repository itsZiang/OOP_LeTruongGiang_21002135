package exercise1.exercise1_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getPopulation() > key.getPopulation()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getPopulation() < key.getPopulation()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < this.length - 1; i++) {
            for (int j = i + 1; j < this.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < this.length; i++) {
            Country key = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        ArrayList<AfricaCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                newArray.add((AfricaCountry) country);
            }
        }
        AfricaCountry[] list = new AfricaCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        ArrayList<AsiaCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                newArray.add((AsiaCountry) country);
            }
        }
        AsiaCountry[] list = new AsiaCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        ArrayList<EuropeCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                newArray.add((EuropeCountry) country);
            }
        }
        EuropeCountry[] list = new EuropeCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        ArrayList<NorthAmericaCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                newArray.add((NorthAmericaCountry) country);
            }
        }
        NorthAmericaCountry[] list = new NorthAmericaCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        ArrayList<OceaniaCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                newArray.add((OceaniaCountry) country);
            }
        }
        OceaniaCountry[] list = new OceaniaCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        ArrayList<SouthAmericaCountry> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                newArray.add((SouthAmericaCountry) country);
            }
        }
        SouthAmericaCountry[] list = new SouthAmericaCountry[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getPopulation() > howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getPopulation() < howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getArea() > howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getArea() < howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getGdp() > howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        ArrayList<Country> newArray = new ArrayList<>();
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                AfricaCountry ACountry = (AfricaCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            } else if (country instanceof AsiaCountry) {
                AsiaCountry ACountry = (AsiaCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            } else if (country instanceof EuropeCountry) {
                EuropeCountry ACountry = (EuropeCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            } else if (country instanceof SouthAmericaCountry) {
                SouthAmericaCountry ACountry = (SouthAmericaCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            } else if (country instanceof NorthAmericaCountry) {
                NorthAmericaCountry ACountry = (NorthAmericaCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            } else if (country instanceof OceaniaCountry) {
                OceaniaCountry ACountry = (OceaniaCountry) country;
                if (ACountry.getGdp() < howMany) newArray.add(country);
            }
        }
        Country[] list = new Country[newArray.size()];
        list = newArray.toArray(list);
        return list;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}