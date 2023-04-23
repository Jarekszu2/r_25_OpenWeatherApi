package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "speed")
public class Speed {

    @XmlAttribute(name = "value")
    private double value;

    @XmlAttribute(name = "unit")
    private String unit;

    @XmlAttribute(name = "name")
    private String name;
}
