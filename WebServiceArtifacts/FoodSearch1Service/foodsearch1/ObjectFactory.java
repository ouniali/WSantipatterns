
package foodsearch1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the foodsearch1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: foodsearch1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FoodSearchResponse }
     * 
     */
    public FoodSearchResponse createFoodSearchResponse() {
        return new FoodSearchResponse();
    }

    /**
     * Create an instance of {@link FoodSearchCategory }
     * 
     */
    public FoodSearchCategory createFoodSearchCategory() {
        return new FoodSearchCategory();
    }

    /**
     * Create an instance of {@link FoodSearch }
     * 
     */
    public FoodSearch createFoodSearch() {
        return new FoodSearch();
    }

    /**
     * Create an instance of {@link GetFood }
     * 
     */
    public GetFood createGetFood() {
        return new GetFood();
    }

    /**
     * Create an instance of {@link GetFoodResponse }
     * 
     */
    public GetFoodResponse createGetFoodResponse() {
        return new GetFoodResponse();
    }

    /**
     * Create an instance of {@link Food }
     * 
     */
    public Food createFood() {
        return new Food();
    }

    /**
     * Create an instance of {@link Serving }
     * 
     */
    public Serving createServing() {
        return new Serving();
    }

    /**
     * Create an instance of {@link Nutrients }
     * 
     */
    public Nutrients createNutrients() {
        return new Nutrients();
    }

    /**
     * Create an instance of {@link FoodSearchResult }
     * 
     */
    public FoodSearchResult createFoodSearchResult() {
        return new FoodSearchResult();
    }

}
