package com.finki.soa.group3.HRSystem.service.devices;

import com.finki.soa.group3.HRSystem.model.devices.Device;
import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;

public interface DeviceService {
    Iterable<Device> getAllDevices();

    Device getDeviceById(long id);

    Device addNewDevice(Device newDevice);

    long deleteDeviceById(long id);

    Iterable<Device> getAllDevicesByCategory(DeviceCategory deviceCategory);
}
