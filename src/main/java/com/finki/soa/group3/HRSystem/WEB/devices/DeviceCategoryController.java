package com.finki.soa.group3.HRSystem.WEB.devices;

import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;
import com.finki.soa.group3.HRSystem.service.devices.DeviceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController(value = "/deviceCategory")
@CrossOrigin
public class DeviceCategoryController {

    @Autowired
    DeviceCategoryService deviceCategoryService;

    @GetMapping(value = "/getAllDeviceCategories")
    public Iterable<DeviceCategory> getAllDeviceCategories() {
        return deviceCategoryService.getAllDeviceCategories();
    }

    @GetMapping(value = "/getDeviceCategoryById")
    public DeviceCategory getDeviceCategoryById(@RequestParam long id) {
        return deviceCategoryService.getDeviceCategoryById(id);
    }

    @PostMapping(value = "/addNewDeviceCategory")
    public DeviceCategory addNewDeviceCategory(@ModelAttribute DeviceCategory deviceCategory) {
        return deviceCategoryService.addNewDeviceCategory(deviceCategory);
    }

}
