package xyz.doublepi.cqrs.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
@Table(name = "download")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Download {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long appId;

    private Long downloadCount;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
    }
}
