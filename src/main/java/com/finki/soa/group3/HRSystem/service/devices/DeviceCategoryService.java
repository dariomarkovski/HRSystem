package com.finki.soa.group3.HRSystem.service.devices;

import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;

public interface DeviceCategoryService {
    Iterable<DeviceCategory> getAllDeviceCategories();

    DeviceCategory getDeviceCategoryById(long id);

    DeviceCategory addNewDeviceCategory(DeviceCategory deviceCategory);
}
