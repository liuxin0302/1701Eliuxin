package com.bawei.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/**
 * ajax工具类
 * @author user
 *
 */
public class ResponseUtil {

	/**
	 * 页面输出方法
	 * @param response
	 * @param o
	 * @throws Exception
	 */
	public static void write(HttpServletResponse response,Object o)throws Exception{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(o.toString());
		out.flush();
		out.close();
	}
}
