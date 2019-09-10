package life.andjoy.resources;

import life.andjoy.services.UserService;
import life.andjoy.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Path("{userId}")
    public User get(@PathParam("userId") String userId) {

        return userService.findOne(userId);
    }

    @POST
    public User save(User user) {

        return userService.saveOrUpdate(user);
    }

    @GET
    public Double getAVG() {

        return userService.avgAge();
    }
}
