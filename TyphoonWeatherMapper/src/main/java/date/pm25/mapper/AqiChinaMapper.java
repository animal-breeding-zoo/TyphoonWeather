package date.pm25.mapper;

import date.pm25.model.AqiChina;

import java.util.List;

/*
 * Created by toy on 22/04/2017.
 *
 */
public interface AqiChinaMapper {
    AqiChina selectByQueryId(String id);
}
