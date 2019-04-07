package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nit.command.TestCommand;

public class PerformOperationController extends MultiActionController {
	
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,TestCommand cmd)
	{
		System.out.println("hello");
		ModelAndView mav= null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operation","add");
		mav.addObject("cmdData",cmd);
		return mav;
		
	}
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,TestCommand cmd)
	{
		ModelAndView mav= null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operation","modify");
		mav.addObject("cmdData",cmd);
		return mav;
	}
	
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,TestCommand cmd)
	{
		//create and return mav object
		ModelAndView mav= null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operation","remove");
		mav.addObject("cmdData",cmd);
		return mav;
	}
	
	public ModelAndView view(HttpServletRequest req,HttpServletResponse res,TestCommand cmd)
	{
		ModelAndView mav= null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operation","show");
		mav.addObject("cmdData",cmd);
		return mav;
	}
	
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,TestCommand cmd)
	{
		ModelAndView mav= null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("operation","invalid");
		mav.addObject("cmdData",cmd);
		return mav;
	}
}
