package com.ahoy.ushop.core.custom;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.ahoy.ushop.core.domain.UserShoppingListDo;

public class UserShoppingListSerializer extends JsonSerializer<UserShoppingListDo> {
    @Override
    public void serialize(UserShoppingListDo value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
       
    	jgen.writeStartObject();
       // jgen.writeStringField("userAppId", value.getUserFkey());
        jgen.writeStringField("userAppId", "pp");
        jgen.writeRaw( ",\"items\":"+value.getItemListJson());
        
//        jgen.writeStringField("userAppId", "777");
//        jgen.writeRaw( ",\"items\":"+"{\"item\":[{\"name\":\"tea\",\"brand\":\"tata\",\"instanceName\":\"agni\",\"quantity\":\"1\"},{\"name\":\"milk\",\"brand\":\"amul\",\"instanceName\":\"fullcream\",\"quantity\":\"3\"}]}");
        jgen.writeEndObject();
        
    }
}