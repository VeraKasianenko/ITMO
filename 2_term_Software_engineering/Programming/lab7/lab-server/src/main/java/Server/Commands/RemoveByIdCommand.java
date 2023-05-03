package Server.Commands;

import Common.exception.DatabaseException;
import Common.util.Request;
import Common.util.Response;
import Server.db.DBManager;
import Server.util.CollectionManager;

public class RemoveByIdCommand extends AbstractCommand {

    public RemoveByIdCommand(CollectionManager collectionManager, DBManager dbManager) {
        super("remove_by_id", "удалить элемент из коллекции по его id", 1,
                collectionManager, dbManager);
    }

    @Override
    public Response execute(Request request) {
        try {
            if (dbManager.validateUser(request.getLogin(), request.getPassword())) {
                if (dbManager.checkOrganizationExistence(request.getNumericArgument())) {
                    if (dbManager.removeById(request.getNumericArgument(), request.getLogin())) {
                        collectionManager.removeById(request.getNumericArgument());
                        return new Response("Элемент с ИД " + request.getNumericArgument() + " был удален из коллекции.");
                    } else {
                        return new Response("Элемент был создан другим пользователем. У вас нет прав для его обновления.");
                    }
                } else {
                    return new Response("Нет элемента с таким идентификатором.");
                }
            } else {
                return new Response("Несоответствие логина и пароля.");
            }
        } catch (DatabaseException e) {
            return new Response(e.getMessage());
        }
    }
}