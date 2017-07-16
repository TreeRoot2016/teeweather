package tree.com.data;

import org.litepal.crud.DataSupport;

/**
 * Created by 89128 on 2017/7/14.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weathId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeathId() {
        return weathId;
    }

    public void setWeathId(String weathId) {
        this.weathId = weathId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
