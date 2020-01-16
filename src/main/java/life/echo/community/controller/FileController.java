package life.echo.community.controller;

import life.echo.community.dto.CommentCreateDTO;
import life.echo.community.dto.CommentDTO;
import life.echo.community.dto.FileDTO;
import life.echo.community.dto.ResultDTO;
import life.echo.community.enums.CommentTypeEnum;
import life.echo.community.exception.CustomizeErrorCode;
import life.echo.community.model.Comment;
import life.echo.community.model.User;
import life.echo.community.provider.UcloudProvider;
import life.echo.community.service.CommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class FileController {
    @Autowired
    private UcloudProvider ucloudProvider;

    @RequestMapping("/file/upload")
    @ResponseBody
    public Object upload(HttpServletRequest request){
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartRequest.getFile("editormd-image-file");
        try {
            String fileName = ucloudProvider.upload(file.getInputStream(), file.getContentType(), file.getOriginalFilename());
            FileDTO fileDTO = new FileDTO();
            fileDTO.setUrl(fileName);
            fileDTO.setSuccess(1);
            return fileDTO;
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileDTO fileDTO = new FileDTO();
        fileDTO.setUrl("/images/wechat.png");
        fileDTO.setSuccess(1);
        return fileDTO;
    }
}
