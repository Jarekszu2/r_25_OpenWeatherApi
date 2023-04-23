package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// Uwaga! nie robić @Data, ani @Getter i @Setter
// Zrobić @NoArgsConstructor, @AllArgsConstructor, @ToString, a żeby mieć dostęp do pól gettery zrobić "z ręki"

//<city id="3163858" name="Zocca">
//    <coord lon="10.99" lat="44.34"/>
//    <country>IT</country>
//    <timezone>7200</timezone>
//    <sun rise="2022-08-30T04:36:27" set="2022-08-30T17:57:28"/>
//</city>
// city jest Elementem (XML) - jest tagiem (zaczyna się "<" i kończy ">" ("/<")
// id jest Atrybutem (XML) - składowa Elementu

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "city")
public class City {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    @XmlElement(name = "coord")
    private Coord coord;

    @XmlElement(name = "country")
    private String country;

    @XmlElement(name = "timezone")
    private int timezone;

    @XmlElement(name = "sun")
    private Sun sun;

}
