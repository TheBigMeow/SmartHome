package smarthome.app;

import nl.stijngroenen.tradfri.device.Gateway;
import nl.stijngroenen.tradfri.util.Credentials;

public  class GatewayConnection {
    private static Gateway stairwayToHeaven;

    public static Gateway getGateway(){
        if(stairwayToHeaven == null){
            Gateway gateway = new Gateway("192.168.0.2");
            Credentials credentials = new Credentials("RX861pqwLLe3oCAO","JeWhNhJfqueZOnyL");
            gateway.connect(credentials);
            stairwayToHeaven = gateway;
        }
        return stairwayToHeaven;
    }
}
