package com.finki.soa.group3.HRSystem.service.devices.Impl;

import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;
import com.finki.soa.group3.HRSystem.persistence.devices.DeviceCategoryDao;
import com.finki.soa.group3.HRSystem.service.devices.DeviceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceCategoryServiceImpl implements DeviceCategoryService {

    @Autowired
    DeviceCategoryDao deviceCategoryDao;

    @Override
    public Iterable<DeviceCategory> getAllDeviceCategories() {
        return deviceCategoryDao.findAll();
    }

    @Override
    public DeviceCategory getDeviceCategoryById(long id) {
        return deviceCategoryDao.findById(id);
    }

    @Override
    public DeviceCategory addNewDeviceCategory(DeviceCategory deviceCategory) {
        return deviceCategoryDao.save(deviceCategory);
    }
}
