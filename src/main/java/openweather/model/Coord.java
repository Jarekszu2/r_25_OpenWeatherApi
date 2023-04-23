package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "coord")
public class Coord {

    @XmlAttribute(name = "lon")
    private double lon;

    @XmlAttribute(name = "lat")
    private double lat;
}
