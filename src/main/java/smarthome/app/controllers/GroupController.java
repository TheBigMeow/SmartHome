package smarthome.app.controllers;

import org.springframework.web.bind.annotation.*;
import smarthome.app.models.SuccessResponse;
import smarthome.app.models.groupmodels.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class GroupController {

    @PostMapping("/device/group/create")
    public GroupCreated createGroup(@RequestBody CreateGroupRequest request) {
        return new GroupCreated("Test", 1);
    }

    @GetMapping("/device/group/all")
    public List<GroupResponse> all() {
        return new ArrayList<>();
    }

    @PostMapping("device/group/add")
    public SuccessResponse add(@RequestBody AddDeviceToGroupRequest request) {
        return new SuccessResponse(true);
    }

    @PostMapping("/device/group/remove")
    public SuccessResponse remove(@RequestBody RemoveDeviceFromGroupRequest request) {
        return new SuccessResponse(true);
    }

    @PostMapping("device/group/on")
    public SuccessResponse on(@RequestBody DeviceGroupOn request){
        return new SuccessResponse(true);
    }

    @PostMapping("device/group/off")
    public SuccessResponse off(@RequestBody DeviceGroupOff request) {
        return new SuccessResponse(true);
    }
}
