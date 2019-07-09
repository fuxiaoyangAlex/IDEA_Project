package com.ithemima.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLEncoder;

/**
 * @ClassName fileDownload
 * @Description TODO
 * @Author tree
 * @Date 2019/5/20 10:57
 * @Version 1.8
 **/
public class fileDownload {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request, String filename)throws Exception{
        //指定要下载的文件所在的路径
        String path=request.getServletContext().getRealPath("//upload//");
//        创建该文件对象
        File file = new File(path+File.separator+filename);
//        编码，防止乱码
//        设置响应头
        HttpHeaders headers = new HttpHeaders();
//        通知浏览器以下载方式打开文件
        headers.setContentDispositionFormData("attachment",filename);
//        定义以流的形式下载返回文件数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//        使用String MVC框架的 ResponseEntity对象封装返回下载数据
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }

/*
* 根据浏览器的不同进行编码设置，返回编码后的文件名
* */

    public String getFilename(HttpServletRequest request,String filename)throws Exception{

//        IE不同版本User-Agent中出现的关键词
        String[] IEBrowseKeyWords = {"MSIE","Trident","Edge"};
//        获取请求头代理信息
        String userAgent = request.getHeader("User-Agent");
        for(String keyWord:IEBrowseKeyWords){
            if(userAgent.contains(keyWord)){
//                IE内核浏览器，统一为UTF-8编码显示
                return URLEncoder.encode(filename,"UTF-8");
            }
        }
//        火狐等其它浏览器统一为ISO-8859-1编码显示
        return  new String(filename.getBytes("UTF-8"),"ISO-8859-1");
    }

}
