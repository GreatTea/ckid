package com.gt.cksite.service;

import com.gt.cksite.entity.Design;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/3/4.
 */
@Service
public class DesignService implements IDesignService {

    public List<Design> listDesign() {
        try {
            Path dir = Files.createDirectories(Paths.get(this.getClass().getResource("/").getPath().replaceAll("^/", "").replaceAll("%20", " ")).resolve("../../ck/result/")).normalize();

            final List<Design> ds = new ArrayList<>();
            Files.walkFileTree(dir, new SimpleFileVisitor<Path>(){

                int max = 5;

                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                    if (0 < max) {
                        Design vo = new Design();
                        vo.setId(String.valueOf(max));
                        vo.setAlt(file.getFileName().toString());
                        vo.setCaption(null);
                        vo.setSrc(file.getFileName().toString());
                        ds.add(vo);
                        max--;
                        return FileVisitResult.CONTINUE;
                    } else {
                        return FileVisitResult.SKIP_SIBLINGS;
                    }
                }
            });

            return ds;
        } catch (IOException e) {
            e.printStackTrace();;
            return Collections.emptyList();
        }
    }
}
