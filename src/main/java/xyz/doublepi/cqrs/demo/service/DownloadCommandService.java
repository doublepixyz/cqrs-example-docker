/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.doublepi.cqrs.demo.service;

import xyz.doublepi.cqrs.demo.entity.Download;

/**
 *
 * @author pi314
 */
public interface DownloadCommandService {

    Download add(Download download);
}
