package com.liuxin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuxin.bean.Goods;
import com.liuxin.bean.Type;
import com.liuxin.bean.ZhongLei;
import com.liuxin.service.GoodsService;
import com.liuxin.util.PageHelpUtil;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("getList.do")
	public String getList(Model model,@RequestParam(defaultValue="1")int cpage) {
		PageHelper.startPage(cpage, 3);
		Map<String, Object> map=new HashMap<>();
		List<Map<String, Object>> getList= goodsService.getList();
		PageInfo<Map<String, Object>> pageInfo=new PageInfo<>(getList);
		Map<String, Object> pageMap = PageHelpUtil.pageMap("getList.do", pageInfo, map);
		model.addAttribute("getList", getList);
		model.addAttribute("pageMap", pageMap);
		return "list";
	}
	@RequestMapping("toadd.do")
	public String toadd() {
		return "add";
	}
	@RequestMapping("getType.do")
	@ResponseBody
	public List<Type> getType() {
		List<Type> types= goodsService.getType();
		return types;
	}
	
	
	@RequestMapping("getZhongLei.do")
	@ResponseBody
	public List<ZhongLei> getZhongLei() {
		List<ZhongLei> zhongLeis= goodsService.getZhongLei();
		return zhongLeis;
	}
	@RequestMapping("add.do")
	public String add(Goods goods) {
		int i= goodsService.add(goods);
		return "redirect:getList.do";
	}
	@RequestMapping("del.do")
	@ResponseBody
	public int del(int gid) {
		int i= goodsService.del(gid);
		return i;
	}
	@RequestMapping("tochakan.do")
	public String tochakan(Model model,int gid) {
		List<Map<String, Object>> tochakan=goodsService.tochakan(gid);
		model.addAttribute("goods", tochakan);
		
		return "chakan";
	}
}
