package com.ahoy.ushop.core.custom;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ahoy.ushop.core.domain.UserShoppingListDo;
import com.ahoy.ushop.core.service.UserManagementService;
@Component
public class UserShoppingListDeserializer extends JsonDeserializer<UserShoppingListDo> {
	
    @Override
    public UserShoppingListDo deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);
        String userAppId =  node.get("userAppId").getTextValue();
        String items = node.get("items").toString();
       
        UserShoppingListDo userShoppingListDo=new UserShoppingListDo();
        userShoppingListDo.setUserAppId(userAppId);
        userShoppingListDo.setItemListJson(items);
        return userShoppingListDo;//new Item(id, itemName, new User(userId, null));
    }
}