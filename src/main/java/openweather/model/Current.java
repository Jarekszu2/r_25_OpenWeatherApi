package openweather.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//<current>
//<city id="3163858" name="Zocca">
//  <coord lon="10.99" lat="44.34"/>
//  <country>IT</country>
//  <timezone>7200</timezone>
//  <sun rise="2022-08-30T04:36:27" set="2022-08-30T17:57:28"/>
//</city>
//<temperature value="298.48" min="297.56" max="300.05" unit="kelvin"/>
//<feels_like value="298.74" unit="kelvin"/>
//<humidity value="64" unit="%"/>
//<pressure value="1015" unit="hPa"/>
//<wind>
//  <speed value="0.62" unit="m/s" name="Calm"/>
//  <gusts value="1.18"/>
//  <direction value="349" code="N" name="North"/>
//</wind>
//<clouds value="100" name="overcast clouds"/>
//<visibility value="10000"/>
//<precipitation value="3.37" mode="rain" unit="1h"/>
//<weather number="501" value="moderate rain" icon="10d"/>
//<lastupdate value="2022-08-30T14:45:57"/>
//</current>


//<current>
//<city id="3099759" name="Elbląg">
//  <coord lon="19.4088" lat="54.1522"/>
//  <country>PL</country>
//  <timezone>7200</timezone>
//  <sun rise="2023-04-14T03:44:21" set="2023-04-14T17:40:43"/>
//</city>
//<temperature value="14.43" min="12.75" max="14.43" unit="celsius"/>
//<feels_like value="13.99" unit="celsius"/>
//<humidity value="79" unit="%"/>
//<pressure value="1010" unit="hPa"/>
//<wind>
//  <speed value="6.37" unit="m/s" name="Moderate breeze"/>
//  <gusts value="11.58"/>
//  <direction value="97" code="E" name="East"/>
//</wind>
//<clouds value="82" name="zachmurzenie umiarkowane"/>
//<visibility value="10000"/>
//<precipitation mode="no"/>
//<weather number="803" value="zachmurzenie umiarkowane" icon="04d"/>
//<lastupdate value="2023-04-14T17:11:29"/>
//</current>

@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "current")
public class Current {

    @XmlElement(name = "city")
    private City city;

    public City getCity() {
        return city;
    }

    @XmlElement(name = "temperature")
    private Temperature temperature;

    public Temperature getTemperature() {
        return temperature;
    }

    @XmlElement(name = "feels_like")
    private Feels_like feels_like;

    @XmlElement(name = "humidity")
    private Humidity humidity;

    @XmlElement(name = "pressure")
    private Pressure pressure;

    @XmlElement(name = "wind")
    private Wind wind;

    @XmlElement(name = "clouds")
    private Clouds clouds;

    public Clouds getClouds() {
        return clouds;
    }

    @XmlElement(name = "visibility")
    private Visibility visibility;

    @XmlElement(name = "precipitation")
    private Precipitation precipitation;

    @XmlElement(name = "weather")
    private Weather weather;

    @XmlElement(name = "lastupdate")
    private Lastupdate lastupdate;
}
