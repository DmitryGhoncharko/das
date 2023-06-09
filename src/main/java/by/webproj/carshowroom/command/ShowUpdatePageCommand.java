package by.webproj.carshowroom.command;

import by.webproj.carshowroom.controller.RequestFactory;
import by.webproj.carshowroom.entity.Org;
import by.webproj.carshowroom.exception.DaoException;
import by.webproj.carshowroom.exception.ServiceError;
import by.webproj.carshowroom.model.dao.OrgDao;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class ShowUpdatePageCommand implements Command{
    private final RequestFactory requestFactory;
    private final OrgDao orgDao;

    @Override
    public CommandResponse execute(CommandRequest request) throws ServiceError, DaoException {
        String id = request.getParameter("id");
        Optional<Org> data = orgDao.getById(Long.valueOf(id));
        request.addAttributeToJsp("org",data.get());
        return requestFactory.createForwardResponse(PagePath.ORG_PAGE.getPath());
    }
}
