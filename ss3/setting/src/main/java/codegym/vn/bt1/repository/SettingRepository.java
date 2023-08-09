package codegym.vn.bt1.repository;

import codegym.vn.bt1.model.Setting;

import java.util.List;

public interface SettingRepository {
    void update(Setting setting);
    List<Setting> findAll();
    Setting findById(int id);
}
