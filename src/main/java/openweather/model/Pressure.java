package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "pressure")
public class Pressure {

    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "unit")
    private String unit;
}
