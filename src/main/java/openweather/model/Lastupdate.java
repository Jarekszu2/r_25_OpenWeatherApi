package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "lastupdate")
public class Lastupdate {

    @XmlAttribute(name = "value")
    private String value;
}
