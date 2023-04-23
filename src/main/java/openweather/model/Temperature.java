package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "temperature")
public class Temperature {

    @XmlAttribute(name = "value")
    private double value;

    public double getValue() {
        return value;
    }

    @XmlAttribute(name = "min")
    private double min;

    @XmlAttribute(name = "max")
    private double max;

    @XmlAttribute(name = "unit")
    private String unit;

    public String getUnit() {
        return unit;
    }
}
