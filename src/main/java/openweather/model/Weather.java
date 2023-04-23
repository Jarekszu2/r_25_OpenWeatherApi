package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "weather")
public class Weather {

    @XmlAttribute(name = "number")
    private int number;

    @XmlAttribute(name = "value")
    private String value;

    @XmlAttribute(name = "icon")
    private String icon;
}
