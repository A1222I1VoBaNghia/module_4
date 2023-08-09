package codegym.vn.bt1.repository;

import codegym.vn.bt1.model.Setting;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class SettingRepositoryImpl implements SettingRepository{
    private static Map<Integer,Setting> staticMap;
    static {
        staticMap = new HashMap<>();
        staticMap.put(1, new Setting(1,"Vietnamese",5,false,"Nghia"));
        staticMap.put(2, new Setting(2,"English",10,true,"Hai"));
        staticMap.put(3, new Setting(3,"Chinese",25,false,"Hoang"));
    }
    @Override
    public void update(Setting setting) {
        if(staticMap.containsKey(setting.getId())){
            staticMap.put(setting.getId(),setting);
        }
    }

    @Override
    public List<Setting> findAll() {
        return new ArrayList<>(staticMap.values());
    }

    @Override
    public Setting findById(int id) {
        return staticMap.get(id);
    }
}
