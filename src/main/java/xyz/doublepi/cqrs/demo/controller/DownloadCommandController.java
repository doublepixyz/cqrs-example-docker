package xyz.doublepi.cqrs.demo.controller;

import xyz.doublepi.cqrs.demo.entity.Download;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import xyz.doublepi.cqrs.demo.service.DownloadCommandService;

@RestController
@RequestMapping("/api/v1")
public class DownloadCommandController {

    @Autowired
    private DownloadCommandService downloadCommandService;

    @PostMapping("/downloads")
    public Download create(@RequestBody Download download) {
        return downloadCommandService.add(download);
    }
}
