package date.pm25.service.impl;

import date.pm25.mapper.AqiChinaMapper;
import date.pm25.model.AqiChina;
import date.pm25.service.AqiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by toy on 26/04/2017.
 */
@Service
public class AqiServiceImpl implements AqiService {
    @Autowired
    AqiChinaMapper aqiChinaMapper;

    @Override
    public AqiChina selectByD1(String d1) {
        AqiChina aqiChina = null;
        try {
            aqiChina = aqiChinaMapper.selectByQueryId(d1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return aqiChina;
    }
}
