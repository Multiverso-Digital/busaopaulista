package com.abreuretto.rotas;

import java.util.HashMap;
import java.util.Map;

public class Arrival_stop {

private Location location;
private String name;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperties(String name, Object value) {
this.additionalProperties.put(name, value);
}

}