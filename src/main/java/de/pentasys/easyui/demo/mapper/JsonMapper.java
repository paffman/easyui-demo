package de.pentasys.easyui.demo.mapper;

import de.pentasys.easyui.demo.service.model.BusinessModel;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by paffenan on 25.11.2014.
 */
public class JsonMapper {

//    kein Spring weil Demo :-)
    private ObjectMapper objectMapper = new ObjectMapper();

    private static final Logger LOGGER = Logger.getLogger(JsonMapper.class);

    public String mapToJson(BusinessModel domainModel) {
        try {
            return objectMapper.writeValueAsString(domainModel);
        } catch (Exception e) {
            LOGGER.error("Error creating JSON: " + e);
            return null;
        }
    }

}
