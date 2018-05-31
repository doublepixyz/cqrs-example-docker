package xyz.doublepi.cqrs.demo.repository;

import xyz.doublepi.cqrs.demo.entity.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadQueryRepository extends JpaRepository<Download, Long> {

    Long countByAppId(String appId);
}
