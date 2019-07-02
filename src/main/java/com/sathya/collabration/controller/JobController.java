package com.sathya.collabration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.CollaborationBackEnd.model.Job;
@RestController
public class JobController
{
	@PostMapping("/addjobs")
	public void addjobs(@RequestBody Job job)
	{
		System.out.println(job.getCompanyName());
		System.out.println(job.getJobDesignation());
		
	}
@RequestMapping("/getjobs")
public List<Job>jobdetails()
{
	List<Job> jobList =new ArrayList<Job>();
	Job job= new Job();
    job.setCompanyName("hp");
	job.setJobDesignation("admin");
	job.setJobLocation("hyderabad");
	job.setSalary("3.6lpa");
	jobList.add(job);
	return jobList;
	
}
}
