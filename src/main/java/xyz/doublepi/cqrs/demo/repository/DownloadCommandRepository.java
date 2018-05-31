package xyz.doublepi.cqrs.demo.repository;

import xyz.doublepi.cqrs.demo.entity.Download;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DownloadCommandRepository extends JpaRepository<Download, Long> {
}
