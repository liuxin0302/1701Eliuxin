package com.bawei.controller.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.entity.Link;
import com.bawei.entity.PageBean;
import com.bawei.service.LinkService;
import com.bawei.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/admin/link")
public class LinkAdminController {
	@Resource
	private LinkService linkService;
	//友情链接列表方法
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,
			@RequestParam(value="rows",required=false)String rows,
			HttpServletResponse response) throws Exception {
				
		PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Link> linkList = linkService.list(map);
		JSONArray jsonArray = JSONArray.fromObject(linkList);
		Long toal = linkService.getToal(map);
		JSONObject result = new JSONObject();
		result.put("rows", jsonArray);
		result.put("toal", toal);
		ResponseUtil.write(response, result);
		return null;
		
	}
	
	
	
	
	
	
}
