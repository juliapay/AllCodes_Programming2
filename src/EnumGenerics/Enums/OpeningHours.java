package EnumGenerics.Enums;

import java.time.DayOfWeek;

public class OpeningHours {
    private final String openingTime;
    private final String closingTime;
    private final OpeningVariations openingVariation;

    public OpeningHours(String openingTime, String closingTime, OpeningVariations openingVariation) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.openingVariation = openingVariation;
    }
    public String getOpeningHoursToday(DayOfWeek dayOfWeek){
        // check if the opening variation the shop has chosen in Mon-Fri
        if (openingVariation.equals(OpeningVariations.MONTOFRI)){
            // if it is a Mon-Fri shop, it will be closed on Sat and Sun but open on all other days
            if(dayOfWeek.equals(DayOfWeek.SATURDAY)){
                return " is closed today";
            }else{
                return " is open from " +openingTime+ " to "+ closingTime+" today.";
            }
        } else if (openingVariation.equals(OpeningVariations.TUETOFRI)) {
            if (dayOfWeek.equals(DayOfWeek.SUNDAY)|| dayOfWeek.equals(DayOfWeek.SATURDAY)||dayOfWeek.equals(DayOfWeek.MONDAY)){
                return " is closed today";
            }else{
                return " is open from " +openingTime+ " to "+ closingTime+" today.";
            }
        }else{
            return " does not have available opening times.";
        }
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public OpeningVariations getOpeningVariation() {
        return openingVariation;
    }
}
