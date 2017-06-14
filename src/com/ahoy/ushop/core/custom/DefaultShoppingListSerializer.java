package com.ahoy.ushop.core.custom;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import com.ahoy.ushop.core.domain.DefaultShoppingListDo;

public class DefaultShoppingListSerializer extends JsonSerializer<DefaultShoppingListDo> {
    @Override
    public void serialize(DefaultShoppingListDo value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
       
    	jgen.writeStartObject();
      //  jgen.writeStringField("familyCategory", value.getFamilyCategoryFkey());
        jgen.writeStringField("familyCategory", "");
        
        jgen.writeRaw( ",\"items\":"+value.getItemListJson());
  
        jgen.writeEndObject();
        
    }
}
