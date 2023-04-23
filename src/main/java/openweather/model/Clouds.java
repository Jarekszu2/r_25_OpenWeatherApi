package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "clouds")
public class Clouds {

    @XmlAttribute(name = "value")
    private int value;

    @XmlAttribute(name = "name")
    private String name;

    public String getName() {
        return name;
    }
}
