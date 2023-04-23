package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "wind")
public class Wind {

    @XmlElement(name = "speed")
    private Speed speed;

    @XmlElement(name = "gusts")
    private Gusts gusts;

    @XmlElement(name = "direction")
    private Direction direction;
}
