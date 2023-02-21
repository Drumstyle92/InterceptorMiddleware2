package co.develhope.InterceptorMiddleware2.entities;

/**
 * @author Drumstyle92
 * Entity class that we will use to form a six-month list in three languages
 */
public class MonthEntity {

    /**
     * Variable that indicates a month in number
     */
    private int monthNumber;

    /**
     * Variable representing the month in English
     */
    private String englishName;

    /**
     * Variable that represents the month in Italian
     */
    private String italianName;

    /**
     * Variable representing the month in german
     */
    private String germanName;

    /**
     * Default constructor of the class it belongs to
     */
    public MonthEntity(){}

    /**
     * @param monthNumber the month number int parameter indicating the month
     * @param englishName the english name English month name parameter
     * @param italianName the italian name Parameter of the name of the month in Italian
     * @param germanName  the german name German month name parameter
     * Parameterized constructor of the class it belongs to
     */
    public MonthEntity(int monthNumber, String englishName, String italianName, String germanName) {
        this.monthNumber = monthNumber;
        this.englishName = englishName;
        this.italianName = italianName;
        this.germanName = germanName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public int getMonthNumber() {
        return monthNumber;
    }

    /**
     * @param monthNumber
     * Method for encapsulation
     */
    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * @param englishName
     * Method for encapsulation
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getItalianName() {
        return italianName;
    }

    /**
     * @param italianName
     * Method for encapsulation
     */
    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

    /**
     * @return
     * Method for encapsulation
     */
    public String getGermanName() {
        return germanName;
    }

    /**
     * @param germanName
     * Method for encapsulation
     */
    public void setGermanName(String germanName) {
        this.germanName = germanName;
    }

}
