package codegym.vn.bt1.service;

import codegym.vn.bt1.model.Setting;

import java.util.List;

public interface SettingService {
    void update(Setting setting);
    List<Setting> findAll();
    Setting findById(int id);
}



