package com.sathya.collabration.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.CollaborationBackEnd.DaoImpl.BlogDaoImpl;
import com.sathya.CollaborationBackEnd.model.Blog;



@RestController
public class BlogController
{
	@Autowired
	BlogDaoImpl blogDaoImpl;
@PostMapping("/addblog")
public void addblogs(@RequestBody Blog blog)
{
	blogDaoImpl.addBlog(blog);
	
}
@GetMapping("/getblogs")
public List<Blog> getBlogs()
{
List<Blog>blogList=	blogDaoImpl.getBlogsList();
	return blogList;
}
}
