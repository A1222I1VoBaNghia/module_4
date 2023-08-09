package codegym.vn.bt1.service;

import codegym.vn.bt1.model.Setting;
import codegym.vn.bt1.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SettingServiceImpl implements SettingService{
    @Autowired
    private SettingRepository settingRepository;
    @Override
    public void update(Setting setting) {
        settingRepository.update(setting);
    }

    @Override
    public List<Setting> findAll() {
        return settingRepository.findAll();
    }

    @Override
    public Setting findById(int id) {
        return settingRepository.findById(id);
    }
}
