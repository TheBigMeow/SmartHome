package smarthome.app.controllers;

import nl.stijngroenen.tradfri.device.Device;
import nl.stijngroenen.tradfri.device.Gateway;
import nl.stijngroenen.tradfri.device.Light;
import nl.stijngroenen.tradfri.util.ColourRGB;
import org.springframework.web.bind.annotation.*;
import smarthome.app.GatewayConnection;
import smarthome.app.models.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class DeviceController {

    @GetMapping("/device/all")
    public List<DeviceResponse> all(){
        Gateway gateway = GatewayConnection.getGateway();
        Device[] de = gateway.getDevices();
        List<DeviceResponse> devices = new ArrayList<>();
        for(Device d : de){
            devices.add(new DeviceResponse(d.getName(), d.getInstanceId()));
        }
        return devices;
    }

    @PostMapping("/device/on")
    public SuccessResponse on(@RequestBody DeviceIdRequest request){
        Gateway gateway = GatewayConnection.getGateway();
        Device d = gateway.getDevice(request.getId());
        if(d != null){
            if(d.isLight()){
                Light light = d.toLight();
                light.setOn(true);
            }
            return  new SuccessResponse(true);
        }else {
            return new SuccessResponse(false);
        }

    }

    @PostMapping("/device/off")
    public SuccessResponse off(@RequestBody DeviceIdRequest request){
        Gateway gateway = GatewayConnection.getGateway();
        Device d = gateway.getDevice(request.getId());
        if(d != null){
            if(d.isLight()){
                Light light = d.toLight();
                light.setOn(false);
            }
            return  new SuccessResponse(true);
        }else {
            return new SuccessResponse(false);
        }

    }

    @PostMapping("/device/changeName")
    public SuccessResponse changeName(@RequestBody NameChangeRequest request){
        SuccessResponse response = new SuccessResponse(false);
        Gateway gateway = GatewayConnection.getGateway();
        Device d = gateway.getDevice(request.getId());
        if (d != null) {
            d.setName(request.getName());
            response.setSuccess(true);

        }
        return  response;

    }

    @PostMapping("/device/dim")
    public SuccessResponse dim(@RequestBody DimLightRequest request){
        SuccessResponse response = new SuccessResponse(false);
        Gateway gateway = GatewayConnection.getGateway();
        Device d = gateway.getDevice(request.getId());
        if (d != null) {
            if(d.isLight()) {
                Light light = d.toLight();
                light.setBrightness(request.getDimValue());
                response.setSuccess(true);
            }
        }
        return  response;

    }

    @PostMapping("/device/colorChange")
    public SuccessResponse colorChange(@RequestBody ColorChangeRequest request){
        SuccessResponse response = new SuccessResponse(false);
        Gateway gateway = GatewayConnection.getGateway();
        Device d = gateway.getDevice(request.getId());
        if(d != null) {
            Light light = d.toLight();
           boolean  x = light.setColourRGB(request.getR(), request.getG(), request.getB());

            response.setSuccess(x);
        }
        return  response;

    }
}
