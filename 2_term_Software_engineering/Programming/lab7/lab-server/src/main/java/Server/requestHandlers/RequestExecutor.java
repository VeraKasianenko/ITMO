package Server.requestHandlers;

import Common.util.Request;
import Common.util.RequestType;
import Common.util.Response;
import Server.ServerConfig;

import java.util.function.Function;

public class RequestExecutor implements Function<Request, Response> {

    @Override
    public Response apply(Request request) {
        if (request != null) {
            if (request.getType().equals(RequestType.COMMAND)) {
                return ServerConfig.commandManager.initCommand(request).execute(request);
            } else if (request.getType().equals(RequestType.REGISTER)) {
                return ServerConfig.usersManager.registerUser(request);
            } else {
                return ServerConfig.usersManager.logInUser(request);
            }
        } else return null;
    }
}
