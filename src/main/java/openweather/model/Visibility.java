package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "visibility")
public class Visibility {

    @XmlElement(name = "value")
    private int value;
}
