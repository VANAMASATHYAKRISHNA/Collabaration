package com.sathya.collabration.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.collabration.model.Blog;

@RestController
public class BlogController
{
@RequestMapping("/getblogs")
public List<Blog> addBlogs()
{
	List< Blog> blogList = new ArrayList<Blog>();
	Blog blog=new Blog();
	Blog blog2 =new Blog();
	blog.setBlogName("abc");
	blog.setBlogOwner("a");
	blog.setBlogTitle("xyz");
	blog2.setBlogName("sk");
	blog2.setBlogOwner("s");
	blog2.setBlogTitle("a");
	return blogList;
	
}
}
