package com.ithemima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName FileUpLoadController
 * @Description TODO
 * @Author tree
 * @Date 2019/5/15 10:52
 * @Version 1.8
 **/

@Controller
public class ImgUploadController {
    @RequestMapping("/upload")
    public String handleUpload(@RequestParam("name") String name,
                               @RequestParam("imgFile") List<MultipartFile> imgFile,
                               HttpServletRequest request, Model model) {
//        设置上传文件的原始名称
        String dirPath = request.getServletContext().getRealPath("//upload//");
        File filePath = new File(dirPath);
//        如果保存文件的地址不存在，则就先创建目录
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        List<String> fileList = new ArrayList<>();
        if (!imgFile.isEmpty() && imgFile.size() > 0) {
            for (MultipartFile file : imgFile) {
                //        获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                //        使用UUID重新命名上传的文件名称
                String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
                fileList.add(newFileName);
                try {
                    file.transferTo(new File(dirPath + newFileName));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("fileList"+fileList  );
        model.addAttribute("name", name);
        model.addAttribute("myImageList", fileList);
        return "showImg";
    }
}
