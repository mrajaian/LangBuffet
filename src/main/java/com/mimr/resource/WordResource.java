package com.mimr.resource;

import com.mimr.model.Word;
import com.mimr.validation.Update;
import io.dropwizard.validation.Validated;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/word/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class WordResource {

    @POST
    @Path("create")
    public Response createWord( @Valid Word word){
        return Response.ok().build();
    }

    @POST
    @Path("update")
    public Response updateWord( @Validated(Update.class) Word word){
        return Response.ok().build();
    }
}
