package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "feels_like")
public class Feels_like {

    @XmlAttribute(name = "value")
    private double value;

    @XmlAttribute(name = "unit")
    private String unit;
}
