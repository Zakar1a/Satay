package satay.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class FileProperties {

    /**
     * Folder location for storing files
     */
    private String location = "C:\\aaa";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
