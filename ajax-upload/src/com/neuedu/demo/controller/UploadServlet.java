/**
 * 
 */
package com.neuedu.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/** 
 * DESC: 基于 HTML5 + Servlet 3.0 + AJAX
 *  maxFileSize: 最大上传文件大小, 字节为单位
 *  fileSizeThreshold: 当数据量大于该值时，内容将被写入文件（Buffer size）
 *        maxRequestSize = 8*1024*1024*6 //针对该 multipart/form-data 请求的最大数量，默认值为-1，表示没有限制
 */
@MultipartConfig( maxFileSize = 1024 *1024 *100 , fileSizeThreshold = 819200)
@WebServlet(description = "文件上传", urlPatterns = { "/upload" })
public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        
        String savePath = request.getServletContext().getRealPath("/upload");

        Collection<Part> parts = request.getParts();
        
        // 遍历所有的表单内容，将表单中的文件写入上传文件目录
        for (Iterator<Part> iterator = parts.iterator(); iterator.hasNext();) {
        
            Part part = iterator.next();
            // 从Part的content-disposition中提取上传文件的文件名
            String fileName = getFileName(part);
            if (fileName != null) {
                part.write( savePath + File.separator + fileName);
            }
        }
        response.getWriter().write("true");
        response.getWriter().close();
	}

	/**
     * 从Part的Header信息中提取上传文件的文件名
     * @param part
     * @return 上传文件的文件名，如果如果没有则返回null
     */
    private String getFileName(Part part) {
        
        // 获取header信息中的content-disposition，如果为文件，则可以从其中提取出文件名
        String fileName = part.getHeader("content-disposition");
        fileName = fileName.substring(fileName.indexOf("filename=\"")+10, fileName.length() - 1);
        return fileName;
    }
}
