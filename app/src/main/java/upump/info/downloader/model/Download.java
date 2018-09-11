package upump.info.downloader.model;

import java.net.URL;

public class Download {
    private int id;
    private String name;
    private String url;
    private boolean finished;
    private URL alterurl;

    public Download() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public URL getAlterurl() {
        return alterurl;
    }

    public void setAlterurl(URL alterurl) {
        this.alterurl = alterurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
