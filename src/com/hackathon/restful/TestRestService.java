package com.hackathon.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wines")
public class TestRestService {

	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public DataBean create(DataBean dataBean) {
		dataBean.getId();
		dataBean =  new DataBean();
		dataBean.setId(5);
		return dataBean;
	}

	@POST @Path("/post")
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public DataBean getDetails(DataBean dataBean) {
		dataBean.getId();
		dataBean =  new DataBean();
		dataBean.setId(5);
		return dataBean;
	}

}
