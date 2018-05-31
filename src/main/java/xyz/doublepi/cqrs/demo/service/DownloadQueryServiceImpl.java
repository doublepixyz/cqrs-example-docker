/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.service;

import xyz.doublepi.cqrs.demo.entity.Download;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.doublepi.cqrs.demo.repository.DownloadQueryRepository;
import java.util.Optional;

/**
 *
 * @author pi314
 */
@Service
public class DownloadQueryServiceImpl implements DownloadQueryService {

    @Autowired
    private DownloadQueryRepository downloadQueryRepository;

    @Override
    public List<Download> findAll() {
        return downloadQueryRepository.findAll();
    }

    @Override
    public Long countByAppId(Long appId) {
        Optional<Download> o = downloadQueryRepository.findById(appId);
        if (o.isPresent()) {
            return o.get().getDownloadCount();
        } else {
            return 0L;
        }
    }
}
