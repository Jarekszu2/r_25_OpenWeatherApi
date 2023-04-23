package openweather;

import openweather.model.Current;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

public class Utilities {

    public Current getCurrentFromOpenWeatherApiXML(String apiURL) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Current.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            URL url = new URL(apiURL);
            return (Current) unmarshaller.unmarshal(url);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
