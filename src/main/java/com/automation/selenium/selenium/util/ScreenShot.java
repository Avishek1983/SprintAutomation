package com.automation.selenium.selenium.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenShot {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    public void getScreenshot (String imgName){
        try {
            File tempFile = this.driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(tempFile, path.resolve(imgName).toFile());
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
