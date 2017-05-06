package date.pm25.service;

import date.pm25.model.AqiChina;

/**
 * Created by toy on 26/04/2017.
 */
public interface AqiService {
    AqiChina selectByD1(String d1);
}
