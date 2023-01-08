package exercise1.exercise1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();

        /* TODO: write code to test program */
        testOriginalData();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterNorthAmericaCountry();
        testFilterSouthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();
        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String countryCode = dataList.get(0);
                String countryLabel = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                new Country(countryCode, countryLabel);
                Country country = switch (continent) {
                    case "Africa" -> new AfricaCountry(countryCode, countryLabel, population, area, gdp);
                    case "Asia" -> new AsiaCountry(countryCode, countryLabel, population, area, gdp);
                    case "Europe" -> new EuropeCountry(countryCode, countryLabel, population, area, gdp);
                    case "North America" -> new NorthAmericaCountry(countryCode, countryLabel, population, area, gdp);
                    case "South America" -> new SouthAmericaCountry(countryCode, countryLabel, population, area, gdp);
                    case "Oceania" -> new OceaniaCountry(countryCode, countryLabel, population, area, gdp);
                    default -> throw new IllegalArgumentException();
                };
                countryManager.append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.println(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codesString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        AfricaCountry[] countries = countryManager.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        AsiaCountry[] countries = countryManager.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        EuropeCountry[] countries = countryManager.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] countries = countryManager.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        OceaniaCountry[] countries = countryManager.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] countries = countryManager.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(100000000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(10000000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(500000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(500000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(20000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(10000);
        String codeString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println(codeString);
    }
}

