package EnumGenerics.Generics;

import Vererbung.Beispiele.Person.Person;
import Vererbung.Beispiele.RabbitHole.EasterRabbit;

public class AppMaybe {
    public static void main(String[] args) {
        Maybe<Person> maybePerson= new Maybe<>(new Person("Hansi","Huber"),3);
        Maybe<EasterRabbit> maybeEasterRabbit= new Maybe<>(new EasterRabbit("Bunny",5,67),1);




        System.out.println(maybePerson.getValueIfAllowed());
        EasterRabbit bunnyRef= maybeEasterRabbit.getValueIfAllowed();
        System.out.println(bunnyRef);



    }
}
