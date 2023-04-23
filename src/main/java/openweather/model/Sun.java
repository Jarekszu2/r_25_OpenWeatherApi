package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "sun")
public class Sun {

    @XmlAttribute(name = "rise")
    private String rise;

    @XmlAttribute(name = "set")
    private String set;
}
