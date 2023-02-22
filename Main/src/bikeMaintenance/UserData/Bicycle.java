package bikemaintenance.userdata;

import bikemaintenance.bikeclasses.*;
import bikemaintenance.service.ServiceRecord;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bicycle {
    private Frame bicycleFrame;
    private Map<String, BrakePad> brakePadMap;
    private Map<String, Cables> cablesMap;
    private Map<String, Cassette> cassetteMap;
    private Map<String, Chain> chainMap;
    private Map<String,Chainring> chainringMap;
    private Map<String,CustomPart> customPartMap;
    private Map<String,Derailleur> derailleurMap;
    private Map<String,DiscBrakes> discBrakesMap;
    private Map<String,Tire> tireMap;
    private Map<String,Wheel> wheelMap;
    private List<ServiceRecord> serviceRecordList;

    public Bicycle(Frame bicycleFrame) {
        this.bicycleFrame = bicycleFrame;
        this.brakePadMap = new HashMap<>();
        this.cablesMap = new HashMap<>();
        this.cassetteMap = new HashMap<>();
        this.chainMap = new HashMap<>();
        this.chainringMap = new HashMap<>();
        this.customPartMap = new HashMap<>();
        this.derailleurMap = new HashMap<>();
        this.discBrakesMap = new HashMap<>();
        this.tireMap = new HashMap<>();
        this.wheelMap = new HashMap<>();
        this.serviceRecordList = new ArrayList<>();
    }

    public List<ServiceRecord> getServiceRecordList() {
        return serviceRecordList;
    }

    public void setServiceRecordList(List<ServiceRecord> serviceRecordList) {
        this.serviceRecordList = serviceRecordList;
    }

    public Frame getBicycleFrame() {
        return bicycleFrame;
    }

    public void setBicycleFrame(Frame bicycleFrame) {
        this.bicycleFrame = bicycleFrame;
    }

    public Map<String, BrakePad> getBrakePadMap() {
        return brakePadMap;
    }

    public void setBrakePadMap(Map<String, BrakePad> brakePadMap) {
        this.brakePadMap = brakePadMap;
    }

    public Map<String, Cables> getCablesMap() {
        return cablesMap;
    }

    public void setCablesMap(Map<String, Cables> cablesMap) {
        this.cablesMap = cablesMap;
    }

    public Map<String, Cassette> getCassetteMap() {
        return cassetteMap;
    }

    public void setCassetteMap(Map<String, Cassette> cassetteMap) {
        this.cassetteMap = cassetteMap;
    }

    public Map<String, Chain> getChainMap() {
        return chainMap;
    }

    public void setChainMap(Map<String, Chain> chainMap) {
        this.chainMap = chainMap;
    }

    public Map<String, Chainring> getChainringMap() {
        return chainringMap;
    }

    public void setChainringMap(Map<String, Chainring> chainringMap) {
        this.chainringMap = chainringMap;
    }

    public Map<String, CustomPart> getCustomPartMap() {
        return customPartMap;
    }

    public void setCustomPartMap(Map<String, CustomPart> customPartMap) {
        this.customPartMap = customPartMap;
    }

    public Map<String, Derailleur> getDerailleurMap() {
        return derailleurMap;
    }

    public void setDerailleurMap(Map<String, Derailleur> derailleurMap) {
        this.derailleurMap = derailleurMap;
    }

    public Map<String, DiscBrakes> getDiscBrakesMap() {
        return discBrakesMap;
    }

    public void setDiscBrakesMap(Map<String, DiscBrakes> discBrakesMap) {
        this.discBrakesMap = discBrakesMap;
    }

    public Map<String, Tire> getTireMap() {
        return tireMap;
    }

    public void setTireMap(Map<String, Tire> tireMap) {
        this.tireMap = tireMap;
    }

    public Map<String, Wheel> getWheelMap() {
        return wheelMap;
    }

    public void setWheelMap(Map<String, Wheel> wheelMap) {
        this.wheelMap = wheelMap;
    }
}
