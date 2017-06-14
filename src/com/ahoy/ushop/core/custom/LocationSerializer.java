package com.ahoy.ushop.core.custom;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.ahoy.ushop.core.domain.PostalCodeDo;

public class LocationSerializer extends JsonSerializer<PostalCodeDo> {
    @Override
    public void serialize(PostalCodeDo value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
       
    	//jgen.writeStartObject();
       
        jgen.writeString( value.getPlaceName()+","+value.getAdminName3()+","+value.getAdminName2()+","+value.getAdminName1()+","+value.getCountryCode());
       // jgen.writeArrayFieldStart(fieldName)
//        jgen.writeStringField("userAppId", "777");
//        jgen.writeRaw( ",\"items\":"+"{\"item\":[{\"name\":\"tea\",\"brand\":\"tata\",\"instanceName\":\"agni\",\"quantity\":\"1\"},{\"name\":\"milk\",\"brand\":\"amul\",\"instanceName\":\"fullcream\",\"quantity\":\"3\"}]}");
       // jgen.writeEndObject();
        
    }
}